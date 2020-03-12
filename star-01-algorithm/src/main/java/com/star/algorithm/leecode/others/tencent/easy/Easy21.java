package com.star.algorithm.leecode.others.tencent.easy;

/**
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4 输出：1->1->2->3->4->4
 *
 * </p>
 *
 * @created： 2019-12-04
 * @author： xingxingzhao
 */
public class Easy21 {

  //合并两个有序链表
  public static void main(String[] args) {

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(4);
    node1.next = node2;
    node2.next = node3;

    ListNode lnode1 = new ListNode(1);
    ListNode lnode2 = new ListNode(3);
    ListNode lnode3 = new ListNode(4);
    lnode1.next = lnode2;
    lnode2.next = lnode3;

    Solution21_1 solution21_1 = new Solution21_1();
    ListNode result = solution21_1.mergeTwoLists(node1, lnode1);
    System.out.println(result);
  }
}

/**
 * Definition for singly-linked list.
 **/
class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

class Solution21_1 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    //递归的结束条件，如果l1和l2中有一个为空就返回
    if (l1 == null || l2 == null) {
      return (l1 == null) ? l2 : l1;
    }
    //如果l1的值<=l2的值，就继续递归，比较l1.next的值和l2的值
    //l1.next和l2比较完后，会产生一个更小的节点x，将x加到当前l1的后面
    if (l1.val <= l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
      //如果l1的值>l2的值，就继续递归，比较l1的值和l2.next的值
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }

  }


}

class Solution21_2 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode p = new ListNode(-1);
    ListNode head = p;
    while (l1 != null && l2 != null) {
      //如果l1的值小于l2的值，就将p.next指向l1
      //然后l1继续往后移动一位
      if (l1.val <= l2.val) {
        p.next = l1;
        l1 = l1.next;
      } else {
        p.next = l2;
        l2 = l2.next;
      }
      p = p.next;
    }
    //如果l1和l2不一样长，等遍历完后，将p的next指向没遍历完的链表即可
    //比如l1长度是3，1->2->3，l2长度是5 1->2->3->8->9
    //等循环结束时，l1就指向8->9，只要将p.next指向8->9即可
    p.next = (l1 == null ? l2 : l1);
    return head.next;
  }
}
