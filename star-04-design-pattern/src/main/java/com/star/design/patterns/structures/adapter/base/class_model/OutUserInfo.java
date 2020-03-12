package com.star.design.patterns.structures.adapter.base.class_model;

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
public class OutUserInfo extends OutUser implements IUserInfo {

  private Map baseUserInfo = super.getBaseUserInfo();
  private Map basePhoneInfo = super.getBasePhoneInfo();
  private Map baseAddressInfo = super.getBaseAddressInfo();

  @Override
  public String getUserName() {

    String username = (String)this.baseUserInfo.get("username");
    return username;
  }

  @Override
  public String getPhoneNum() {

    String phone =(String) this.basePhoneInfo.get("phone");
    return phone;
  }

  @Override
  public String getUserAddress() {

    String address = (String)this.baseAddressInfo.get("address");
    return address;
  }
}
