package com.star.design.patterns.structures.adapter.base.object_model;

import com.star.design.patterns.structures.adapter.base.IUserInfo;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class OutUserInfo implements IUserInfo {

  private IOutBasePhoneInfo basePhoneInfo = null;
  private IOutBaseAddressInfo baseAddressInfo = null;
  private IOutBaseUserInfo baseUserInfo = null;

  public OutUserInfo(
      IOutBasePhoneInfo basePhoneInfo,
      IOutBaseAddressInfo baseAddressInfo,
      IOutBaseUserInfo baseUserInfo) {
    this.basePhoneInfo = basePhoneInfo;
    this.baseAddressInfo = baseAddressInfo;
    this.baseUserInfo = baseUserInfo;

    userMap = baseUserInfo.getBaseUserInfo();
    addressMap = baseAddressInfo.getBaseAddressInfo();
    phoneMap = basePhoneInfo.getBasePhoneInfo();
  }

  private Map userMap = null;
  private Map addressMap = null;
  private Map phoneMap = null;

  @Override
  public String getUserName() {

    String username = (String) this.userMap.get("username");
    return username;
  }

  @Override
  public String getPhoneNum() {

    String phone = (String) this.phoneMap.get("phone");
    return phone;
  }

  @Override
  public String getUserAddress() {

    String address = (String) this.addressMap.get("address");
    return address;
  }
}
