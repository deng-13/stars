package com.star.algorithm.leecode.others.tencent.easy;

import java.util.Arrays;

/**
 * <p>
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * </p>
 *
 * @created： 2019-12-08
 * @author： xingxingzhao
 */
public class Easy88 {


  public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};

    Solution88_1 solution88_1 = new Solution88_1();

    solution88_1.merge(nums1, 3, nums2,3);

  }

}

class Solution88_1 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    System.arraycopy(nums2, 0, nums1, m, n);
    Arrays.sort(nums1);
    System.out.println(nums1);
  }
}

