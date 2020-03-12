package com.star.algorithm.leecode.others.tencent.easy;

/**
 * <p>
 *
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例： 给定二叉树 [3,9,20,null,null,15,7]，
 *
 * 3 / \ 9  20 /  \ 15   7 返回它的最大深度 3 。
 *
 * </p>
 *
 * @created： 2019-12-08
 * @author： xingxingzhao
 */
public class Easy104 {

}

/* Definition for a binary tree node. */
class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

class Solution104 {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left_height = maxDepth(root.left);
    int right_height = maxDepth(root.right);
    return Math.max(left_height, right_height) + 1;
  }
}
