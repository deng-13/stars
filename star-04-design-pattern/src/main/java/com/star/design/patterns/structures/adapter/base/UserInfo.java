package com.star.design.patterns.structures.adapter.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class UserInfo implements IUserInfo {

  @Override
  public String getUserName() {
    System.out.println(" 用户名称是 aaaaa");
    return null;
  }

  @Override
  public String getPhoneNum() {

    System.out.println(" 手机号码是 12222");
    return null;
  }

  @Override
  public String getUserAddress() {

    System.out.println(" 家庭地址是 紫禁城");
    return null;
  }
}
