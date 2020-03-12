package com.star.design.patterns.behavirous.strategy;

import java.util.Optional;

/**
 * <p>
 * 门店信息更新，返回hotelId
 * </p>
 *
 * @created： 2019-10-29
 * @author： xingxingzhao
 */
//@Component("hotelChangeLog")
//@Log4j2
public class HotelChangeLog implements BusinessChangeStrategy {

  @Override
  public Optional<Long> getHotelId(Object object, ChangeLog changeLog) {

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>变更日志-门店变更：hotelId->");
    return Optional.of(1L);
  }
}
