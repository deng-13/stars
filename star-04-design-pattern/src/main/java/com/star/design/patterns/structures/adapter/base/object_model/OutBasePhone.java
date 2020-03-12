package com.star.design.patterns.structures.adapter.base.object_model;

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
public class OutBasePhone implements IOutBasePhoneInfo {

  @Override
  public Map getBasePhoneInfo() {
    Map map = new HashMap();
    map.put("phone", "1312312");
    return map;
  }
}
