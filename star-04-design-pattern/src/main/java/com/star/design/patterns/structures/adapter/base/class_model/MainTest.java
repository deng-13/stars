package com.star.design.patterns.structures.adapter.base.class_model;

import com.star.design.patterns.structures.adapter.base.UserInfo;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class MainTest {

  public static void main(String[] args) {

    UserInfo user = new UserInfo();

    for (int i = 0 ; i < 100 ; i++)
      user.getPhoneNum();

    OutUserInfo outUserInfo = new OutUserInfo();

    for (int i = 0 ; i < 100 ; i++)
      outUserInfo.getPhoneNum();

  }
}
