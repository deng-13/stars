package com.star.algorithm.leecode.others.tencent.easy;

import java.util.Stack;

/**
 * <p>
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * </p>
 *
 * @created： 2019-12-04
 * @author： xingxingzhao
 */
public class Easy7 {

  public static void main(String[] args) {
//    Solution7_1 solution = new Solution7_1();
//    System.out.println(solution.reverse(0));
//
//    Solution7_2 solution2 = new Solution7_2();
//    System.out.println(solution2.reverse(0));

    char[] chars = String.valueOf(123333).toCharArray();
  }
}

class Solution7_1 {

  public int reverse(int x) {
    long rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      rev = rev * 10 + pop;
    }
    if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
      return 0;
    }
    int result = (int) rev;
    return result;
  }
}

class Solution7_2 {

  public int reverse(int x) {

    Stack stack = new Stack();
    String tem = Integer.toString(x);
    int i = 0;
    while (i < tem.length()) {
      stack.push(tem.charAt(i));
      i++;
    }
    String result = "";
    int j = 0;
    while (!stack.empty()) {
      String pop = stack.pop().toString();
      if (j == 0 && pop.equals("0")) {
        continue;
      }
      if (pop.equals("-")) {
        result = pop + result;
      } else {
        result = result + pop;
      }
      j++;
    }

    if (result.equals(""))
      return 0 ;
    Long value = Long.valueOf(result).longValue();
    if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
      return 0;
    }

    return value.intValue();
  }
}
