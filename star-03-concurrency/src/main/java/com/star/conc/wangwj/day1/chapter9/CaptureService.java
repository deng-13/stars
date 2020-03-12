package com.star.conc.wangwj.day1.chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 *  todo finished
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class CaptureService {

  public static void main(String[] args) {

    List<Thread> list = new ArrayList();
    Arrays.asList("M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M10").stream()
        .map(CaptureService::createCaptureThread).forEach(
        m -> {
          m.start();
          list.add(m);
        }
    );

    list.stream().forEach(
        l -> {
          try {
            l.join();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
    );

  }

  public static Thread createCaptureThread(String name) {

    return new Thread(() ->{

      Optional.of(" the worker [" + Thread.currentThread().getName() + "] begin capture data");

    }, name);
  }
}
