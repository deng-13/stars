package com.star.conc.basic.chapter5.scene_5_4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    UserInfo userInfo = new UserInfo();
    MyRunnable myRunnable = new MyRunnable(userInfo);

    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 3, 4, TimeUnit.SECONDS,
        new LinkedBlockingDeque<>());

    Future<UserInfo> future = poolExecutor.submit(myRunnable, userInfo);

    userInfo = future.get();

    System.out.println("userInfo.name= " + userInfo.getName() +  " ;userInfo.age= " + userInfo.getAge());

  }
}
