package com.star.algorithm.leecode.others.tencent.easy;

/**
 * <p>
 *
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * </p>
 *
 * @created： 2019-12-08
 * @author： xingxingzhao
 */
public class Easy70 {

  public static void main(String[] args) {

    Solution70_1 solution70_1 = new Solution70_1();
    System.out.println(solution70_1.climbStairs(6));
    Solution70_2 solution70_2 = new Solution70_2();
    System.out.println(solution70_2.climbStairs(6));
  }
}

class Solution70_1 {
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }
    int first = 1;
    int second = 2;
    for (int i = 3; i <= n; i++) {
      int third = first + second;
      first = second;
      second = third;
    }
    return second;
  }
}

class Solution70_2 {
  public int climbStairs(int n) {
    double sqrt5=Math.sqrt(5);
    double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
    return (int)(fibn/sqrt5);
  }
}


