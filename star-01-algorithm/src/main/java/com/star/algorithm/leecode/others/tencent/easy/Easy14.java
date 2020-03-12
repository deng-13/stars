package com.star.algorithm.leecode.others.tencent.easy;

/**
 * <p>
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"] 输出: "fl" 示例 2:
 *
 * 输入: ["dog","racecar","car"] 输出: "" 解释: 输入不存在公共前缀。
 *
 * </p>
 *
 * @created： 2019-12-05
 * @author： xingxingzhao
 */
public class Easy14 {

  public static void main(String[] args) {

    String[] str1 = {"flower","flow","flight"};
    String[] str2 = {"dog","racecar","car"};


    Solution14_1 solution14_1 = new Solution14_1();
    System.out.println(solution14_1.longestCommonPrefix(str1));
    System.out.println(solution14_1.longestCommonPrefix(str2));

  }
}

class Solution14_1 {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {

      System.out.println(strs[i].indexOf(prefix));
      while (strs[i].indexOf(prefix) != 0) {
        System.out.println(prefix);
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) {
          return "";
        }
      }
    }
    return prefix;
  }
}
