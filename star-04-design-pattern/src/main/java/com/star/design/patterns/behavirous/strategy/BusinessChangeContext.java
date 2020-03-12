package com.star.design.patterns.behavirous.strategy;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * 业务信息修改上下文
 * </p>
 *
 * @created： 2019-10-29
 * @author： xingxingzhao
 */
//@Service
public class BusinessChangeContext {

  private final Map<String, BusinessChangeStrategy> strategyMap = new ConcurrentHashMap<>();

  //@Autowired
  public BusinessChangeContext(Map<String, BusinessChangeStrategy> strategyMap) {
    this.strategyMap.clear();
    strategyMap.forEach((k, v) -> this.strategyMap.put(k, v));
  }


  public Optional<Long> getHotelId(Object object, ChangeLog changeLog) {
    return this.strategyMap.get(changeLog.className()).getHotelId(object, changeLog);
  }
}
