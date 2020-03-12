package com.star.algorithm.leecode.others.tencent.easy;

/**
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121 输出: true 示例 2:
 *
 * 输入: -121 输出: false 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。 示例 3:
 *
 * 输入: 10 输出: false 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * </p>
 *
 * @created： 2019-12-04
 * @author： xingxingzhao
 */
public class Easy9 {

  public static void main(String[] args) {

    int x = -0;
    Solution8_1 solution = new Solution8_1();
    System.out.println(solution.isPalindrome(x));

    Solution8_2 solution1 = new Solution8_2();
    System.out.println(solution1.isPalindrome(x));
  }

}


class Solution8_1 {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int z = x;
    int y = 0;
    while (x != 0) {
      int pop = x % 10;
      x = x / 10;
      try {
        y = y * 10 + pop;
      } catch (Exception e) {
        return false;
      }
    }
    return z == y;
  }
}

class Solution8_2 {

  public boolean isPalindrome(int x) {

    if (x >= 0 && x < 10) {
      return true;
    }
    if (x > -10 && x < 0) {
      return false;
    }

    char[] temp = String.valueOf(x).toCharArray();

    for (int i = 0; i < temp.length / 2 + 1; i++) {
      if (temp[i] == '-') {
        return false;
      }

      if (i == temp.length - i - 1) {
        return true;
      }
//      int left = Integer.parseInt(String.valueOf(temp[i]));
//      int right = Integer.parseInt(String.valueOf(temp[temp.length - i - 1]));
//      if (left == right) {
//        continue;
//      } else {
//        return false;
//      }

      if (temp[i] == temp[temp.length - i - 1]) {
        continue;
      } else {
        return false;
      }
    }
    return true;
  }

}

// 减少for 循环中的 判断次数 和代码行数
class Solution8_0 {
  public boolean isPalindrome(int x) {

    if (x >= 0 && x < 10) {
      return true;
    }
    if (x > -10 && x < 0) {
      return false;
    }

    char[] temp = String.valueOf(x).toCharArray();
    if (temp[0] == '-') {
      return false;
    }

    for (int i = 0; i < temp.length / 2 + 1; i++) {

      if (temp[i] == temp[temp.length - i - 1]) {
        continue;
      } else {
        return false;
      }

    }
    return true;
  }
}