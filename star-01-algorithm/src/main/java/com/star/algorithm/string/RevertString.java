package com.star.algorithm.string;

import java.util.Stack;

/**
 * <p>
 *  input = "asd123$%%";
 *  output = "%%$321dsa";
 * </p>
 *
 * @created： 2020-01-06
 * @author： xingxingzhao
 */
public class RevertString {

  public static void main(String[] args) {

    String input = "asd123$%%";

    char[] chars = input.toCharArray();
    String result = "";
    String temp = "";
    for (int i = chars.length -1 ; i >=0 ; i--){

      if ((chars[i] >= 'a' && chars[i] <= 'z' ) || (chars[i] >= 'A' && chars[i] <= 'Z' )){
        temp =  temp + chars[i];
      } else {
        result = result + chars[i] ;
      }
    }

    System.out.println(result + temp);
  }

}
