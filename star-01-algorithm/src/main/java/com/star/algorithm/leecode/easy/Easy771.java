package com.star.algorithm.leecode.easy;

/**
 * <p>
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 *
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 * 注意:
 *
 *  S 和 J 最多含有50个字母。
 *  J 中的字符不重复。
 *
 * @created： 2019-08-15
 * @author： xingxingzhao
 */
public class Easy771 {

    public static void main(String[] args) {
        String j = "aA";
        String s = "aAADDDDD";
        System.out.println(numJewelsInStones1(j ,s));
    }

    public static int numJewelsInStones(String J, String S) {

        int res = 0;

        for (int i = 0; i < S.length(); i++)
            if (J.contains(S.substring(i, i + 1))) res++;

        return res;
    }

    public static int numJewelsInStones1(String j, String s){

        int res = 0;
        char[] arr = s.toCharArray();
        for (int i = 0 ; i< arr.length ; i++){
            if (j.indexOf(arr[i]) != -1)
            {
                res++ ;
            } else {
                continue;
            }
        }
        return res;
    }
}