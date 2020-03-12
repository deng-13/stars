package com.star.conc.wangwj.day1.chapter10;

import com.star.conc.wangwj.day1.chapter10.Lock.TimeoutException;
import java.util.stream.Stream;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class LockTest {

  public static void main(String[] args) throws InterruptedException {

    final BooleanLock lock = new BooleanLock();
    Stream.of("H1","H2","H3","H4").forEach( name -> {
        new Thread(() -> {
          try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " have the lock monitor.");

            work();
          } catch (InterruptedException e) {
            e.printStackTrace();
            e.printStackTrace();
          } finally {
            try {
              lock.unLock();
            } catch (InterruptedException e) {
              e.printStackTrace();
            } catch (TimeoutException e) {
              e.printStackTrace();
            }
          }

        }, name).start();
    });

    Thread.sleep(1000);
  }

  public static void work() throws InterruptedException {

    System.out.println(Thread.currentThread().getName() + " is working .");
    Thread.sleep(2000);
  }
}
