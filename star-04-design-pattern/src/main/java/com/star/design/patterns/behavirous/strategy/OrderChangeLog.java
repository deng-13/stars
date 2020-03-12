package com.star.design.patterns.behavirous.strategy;

import java.util.Optional;

/**
 * <p>
 * 订单新增等 返回hotelId
 * </p>
 *
 * @created： 2019-10-29
 * @author： xingxingzhao
 */
public class OrderChangeLog implements BusinessChangeStrategy {

  @Override
  public Optional<Long> getHotelId(Object object, ChangeLog changeLog) {

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>变更日志-订单变更：hotelId->");

    return Optional.empty();
  }
}
