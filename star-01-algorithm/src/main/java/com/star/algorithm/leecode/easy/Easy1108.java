package com.star.algorithm.leecode.easy;

/**
 * <p>
 *Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 *
 *
 *
 * Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * </p>
 *
 * @created： 2019-08-20
 * @author： xingxingzhao
 */
public class Easy1108 {

    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
        }
        return sb.toString();
    }

    public String defangIPaddr1(String address) {
        return address.replace(".", "[.]");
    }

    public String defangIPaddr2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i)
            sb.append(s.charAt(i) == '.' ? "[.]" : s.charAt(i));
        return sb.toString();
    }
}
