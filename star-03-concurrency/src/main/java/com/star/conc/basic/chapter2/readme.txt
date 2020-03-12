1. CountDownLatch : 可以控制线程执行任务执行的时机，是线程以"组团" 的方式一起执行任务
  1> downLatch.await() -> 执行时，代码呈等待状态，程序不继续执行;
  2> downLatch.countDown() -> 执行时，计数由1变成0，以前呈 等待状态的线程继续往下运行
  3> getCount() -> 获取当前计数的值
  4> CountDownLatch 是减法操作

  缺点： 仅仅支持一次线程与同步点阻塞的特点
2.CyclicBarrier : 多个线程之间相互等待，任何一个线程完成之前，其他线程都必须等待，重点是：
  "多个线程之间"任何一个线程未完成任务，则所有的线程都必须等待。
  1> cyclicBarrier.await() ->
     CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
          @Override
          public void run() {
            System.out.println("全来了");
          }
        });
     设置了最大为2个的 parties 的同行者，只有5个线程都执行了 cyclicBarrier.await() 方法程序才能继续向下执行
  2> cyclicBarrier.getNumberWaiting() -> 获得有几个线程已经达到了瓶颈点
  3> cyclicBarrier.isBroken() -> 查询此瓶颈点是否处于损坏状态
  4> cyclicBarrier.getParties() -> 获取 同行者的个数
  5> cyclicBarrier.reset() -> 重置屏障
  6> CyclicBarrier 是加法操作

  缺点：不可以动态添加 parties 的计数，调用一次await() 方法仅仅占用1个 parties计数