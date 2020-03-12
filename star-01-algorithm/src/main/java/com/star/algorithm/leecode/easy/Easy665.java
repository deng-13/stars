package com.star.algorithm.leecode.easy;

/**
 * <p>
 * Non-decreasing Array: 非递减数列
 * </p>
 *
 * @created： 2019-07-13
 * @author： xingxingzhao
 */
public class Easy665 {

    public static void main(String[] args) {

        int[] nums = {1,3,2};

        Solution solution = new Solution();
        System.out.println(solution.checkPossibility(nums));

    }


}

class Solution {
    public boolean checkPossibility(int[] nums) {

        int n = nums.length, count = 0;

        for (int i = 0; i + 1 < n; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (i > 0 && nums[i + 1] < nums[i - 1])
                    nums[i + 1] = nums[i];
                else
                    nums[i] = nums[i + 1];
            }
        }

        return count <= 1;

    }
}
