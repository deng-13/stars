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
public class OutBaseAddress implements IOutBaseAddressInfo {

  @Override
  public Map getBaseAddressInfo() {
    Map map = new HashMap();
    map.put("address", "sfkjlsffff");
    return map;
  }
}
