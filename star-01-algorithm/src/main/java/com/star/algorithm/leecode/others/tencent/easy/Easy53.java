package com.star.algorithm.leecode.others.tencent.easy;

/**
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4], 输出: 6 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * </p>
 *
 * @created： 2019-12-07
 * @author： xingxingzhao
 */
public class Easy53 {

  public static void main(String[] args) {

    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    Solution53_1 solution53_1 = new Solution53_1();
    Solution53_2 solution53_2 = new Solution53_2();

    System.out.println(solution53_1.maxSubArray(nums));
    System.out.println(solution53_2.maxSubArray(nums));
  }
}

class Solution53_1 {

  public int maxSubArray(int[] nums) {

    int ans = nums[0];
    int temp = nums[0];
    for (int i = 1 ; i < nums.length -1; i++) {
      temp += nums[i];

      if (temp > ans){
         ans = temp;
         continue;
      }
        temp = nums[i];
        ans = nums[i];
    }
    return ans;

  }
}

class Solution53_2 {
  public int maxSubArray(int[] nums) {
    int ans = nums[0];
    int sum = 0;
    for(int num: nums) {
      if(sum > 0) {
        sum += num;
      } else {
        sum = num;
      }
      ans = Math.max(ans, sum);
    }
    return ans;
  }
}


