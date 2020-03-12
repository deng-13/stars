package com.star.design.patterns.structures.proxy;

import java.time.LocalDate;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
@Data
public class OrderServiceStaticProxy implements IOrderService {

  private IOrderService orderService;

  public OrderServiceStaticProxy(IOrderService orderService) {
    this.orderService = orderService;
  }

  public Integer createOrder(Order order) {
    before();

    DynamicDataSourceEntry.set(LocalDate.now().getYear());

    orderService.createOrder(order);

    after();
    return Integer.valueOf(0);
  }

  private void before() {
    System.out.println(" proxy before method");
  }

  private void after() {

    System.out.println(" proxy after method");
  }
}
