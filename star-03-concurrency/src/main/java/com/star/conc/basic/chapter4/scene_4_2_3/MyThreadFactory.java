package com.star.conc.basic.chapter4.scene_4_2_3;

import java.util.concurrent.ThreadFactory;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyThreadFactory implements ThreadFactory {

  @Override
  public Thread newThread(Runnable r) {

    // r 一定要传入 new Thread(r) 中，否则线程失效
    Thread thread = new Thread(r);
    thread.setName("定制池中线程对象的名称-" + Math.random()  );

    return thread;
  }
}
