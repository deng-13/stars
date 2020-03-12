package com.star.design.patterns.structures.proxy;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class OrderService implements IOrderService {

  private OrderDao orderDao ;

  public OrderService(){
    orderDao = new OrderDao();
  }

  @Override
  public Integer createOrder(Order order) {
    System.out.println("OrderService 调用 OrderDao 创建 order ok");
    return orderDao.insertOrder(order);
  }
}
