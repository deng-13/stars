package com.star.conc.wangwj.day1.chapter13;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * <p>
 * todo 待增加 拒绝策略等
 * </p>
 *
 * @created： 2020-03-09
 * @author： xingxingzhao
 */
public class SimpleThreadPool {


  private int size;

  private final static int DEFAULT_SIZE = 10;

  private static volatile int seq = 0;

  private final static String THREAD_PREFIX = "Simple-Thread-pool:";
  private final static ThreadGroup group = new ThreadGroup("group_pool");
  private final static LinkedList<Runnable> TASK_QUEUE = new LinkedList<>();
private final static List<WorkTask> THREAD_QUEUE = new ArrayList<>();

  public SimpleThreadPool() {
    this.size = DEFAULT_SIZE;
    init();
  }

  public SimpleThreadPool(int size) {
    this.size = size;
    init();
  }

  private void init() {

    for (int i = 0 ; i < size ; i++){
      createWorkTask();
    }

  }

  public void submit(Runnable runnable){

    synchronized (TASK_QUEUE){
      TASK_QUEUE.addLast(runnable);
      TASK_QUEUE.notifyAll();
    }
  }

  private void createWorkTask() {

    WorkTask task = new WorkTask(group, THREAD_PREFIX + (seq ++));
    task.start();
    THREAD_QUEUE.add(task);
  }

  private enum TaskState {

    FREE, RUNNING, BLOCKED, DEAD
  }

  private static class WorkTask extends Thread {

    private volatile TaskState taskState = TaskState.FREE;

    public WorkTask(ThreadGroup threadGroup, String name) {
      super(threadGroup, name);
    }

    public TaskState getTaskState() {

      return this.taskState;
    }

    public void run() {

      while (this.taskState != TaskState.DEAD) {

        OUTER:
        synchronized (TASK_QUEUE) {

          while (TASK_QUEUE.isEmpty()) {
            try {
              taskState = TaskState.BLOCKED;
              TASK_QUEUE.wait();
            } catch (InterruptedException e) {
              break OUTER;
            }
          }

          Runnable runnable = TASK_QUEUE.removeFirst();

          if (runnable != null) {
            taskState = TaskState.BLOCKED;
            runnable.run();
            taskState = TaskState.FREE;
          }
        }
      }
    }

    public void close() {

      this.taskState = TaskState.DEAD;
    }
  }

  public static void main(String[] args) {

    SimpleThreadPool pool = new SimpleThreadPool();

    IntStream.rangeClosed(0, 40).forEach(i -> {
      pool.submit(() -> {
        System.out.println(" the runnable " + i + "be serviced by " + Thread.currentThread());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(" the runnable " + i + "be closed by " + Thread.currentThread());

      });
    });
  }
}
