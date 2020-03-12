package com.star.design.patterns.structures.proxy;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class MainTest {

  public static void main(String[] args) {

    Order order = new Order();

    order.setCreateTime(LocalDateTime.now().toEpochSecond(ZoneOffset.MAX));
    order.setId(System.currentTimeMillis());

    IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
    orderService.createOrder(order);

  }
}
