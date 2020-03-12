package com.star.design.patterns.structures.proxy;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class OrderDao {

  public Integer insertOrder(Order order){

    System.out.println("OrderDao 创建 order ok ");

    return Integer.valueOf(1);
  }
}
