package com.star.conc.basic.chapter5.scene_5_4;


/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyRunnable implements Runnable {

  private UserInfo userInfo;

  @Override
  public void run() {

    userInfo.setName("name");
    userInfo.setAge("18");
  }

  public MyRunnable(UserInfo userInfo) {
    this.userInfo = userInfo;
  }
}
