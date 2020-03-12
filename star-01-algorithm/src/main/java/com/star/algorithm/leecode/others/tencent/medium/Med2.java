package com.star.algorithm.leecode.others.tencent.medium;

/**
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * </p>
 *
 * @created： 2019-12-04
 * @author： xingxingzhao
 */
public class Med2 {

  public static void main(String[] args) {

    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(4);
    ListNode node3 = new ListNode(5);
    node1.next = node2;
    node2.next = node3;

    ListNode lnode1 = new ListNode(5);
    ListNode lnode2 = new ListNode(6);
    ListNode lnode3 = new ListNode(4);
    lnode1.next = lnode2;
    lnode2.next = lnode3;

    Solution solution = new Solution();
    ListNode result = solution.addTwoNumbers(node1, lnode1);

    System.out.println(result);
  }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (p != null) p = p.next;
      if (q != null) q = q.next;
    }
    if (carry > 0) {
      curr.next = new ListNode(carry);
    }
    return dummyHead.next;

  }
}