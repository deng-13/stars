package com.star.design.patterns.structures.adapter.base.class_model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class OutUser implements IOutUser {

  @Override
  public Map getBaseUserInfo() {

    Map map = new HashMap();
    map.put("username","asss");
    map.put("sex","male");
    return map;
  }

  @Override
  public Map getBasePhoneInfo() {

    Map map = new HashMap();
    map.put("phone","1233111");
    return map;
  }

  @Override
  public Map getBaseAddressInfo() {

    Map map = new HashMap();
    map.put("address","海淀区");
    return map;
  }
}
