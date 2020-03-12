package com.star.algorithm.leecode.easy;


import com.star.algorithm.leecode.common.DoubleLinkNode;

/**
 * <p>
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 * <p>
 * 在链表类中实现这些功能：
 * <p>
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 *  
 * 示例：
 * <p>
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
 * linkedList.get(1);            //返回2
 * linkedList.deleteAtIndex(1);  //现在链表是1-> 3
 * linkedList.get(1);            //返回3
 *  
 * 提示：
 * 所有值都在 [1, 1000] 之内。
 * 操作次数将在  [1, 1000] 之内。
 * 请不要使用内置的 LinkedList 库。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/design-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </p>
 *
 * @created： 2019-07-18
 * @author： xingxingzhao
 */
public class Easy707 {

}

class MyLinkedList {

    private DoubleLinkNode head;

    private DoubleLinkNode tail;

    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {

        if (index > size - 1) {
            return -1;
        } else if (index == 0) {
            return head.value;

        } else if (index == size) {
            return tail.value;
        } else {

            boolean searchFromStart = true;
            if ((size - index) < index) {
                searchFromStart = false;
            }
            DoubleLinkNode temp = head;
            int tempindex = 0;
            if (!searchFromStart) {
                tempindex = size - 1;
                temp = tail;
            }
            while (temp != null) {
                if (tempindex == index) {
                    return temp.value;
                }
                if (searchFromStart) {
                    tempindex++;
                    temp = temp.next;
                } else {
                    tempindex--;
                    temp = temp.prev;
                }
            }

        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null) {
            head = new DoubleLinkNode( null, val,null);
            tail = head;
        } else {
            DoubleLinkNode newNode = new DoubleLinkNode(head, val, null);
            head.prev = newNode;
            head = newNode;

        }
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (tail == null) {
            head = new DoubleLinkNode( null, val,null);
            tail = head;
        } else {
            DoubleLinkNode newNode = new DoubleLinkNode( null, val,null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            addAtHead(val);
            return;
        }
        if (index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        } else if (index == size) {
            addAtTail(val);
            return;
        } else {

            boolean searchFromStart = true;
            if ((size - index) < index) {
                searchFromStart = false;
            }

            DoubleLinkNode temp = head;
            int tempindex = 0;
            if (!searchFromStart) {
                tempindex = size - 1;
                temp = tail;
            }
            while (temp != null) {

                if (tempindex == index) {

                    DoubleLinkNode newNode = new DoubleLinkNode( temp,val, temp.prev);
                    temp.prev.next = newNode;
                    temp.prev = newNode;
                    size++;
                    return;
                }
                if (searchFromStart) {
                    tempindex++;
                    temp = temp.next;
                } else {
                    tempindex--;
                    temp = temp.prev;
                }
            }
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index > size - 1) {
            return;
        } else if (index < 0) {
            return;
        }

        DoubleLinkNode temp = head;

        int tempindex = 0;
        while (temp != null) {

            if (tempindex == index) {

                if (temp.prev == null) {
                    head = temp.next;
                } else if (temp.next == null) {
                    tail = temp.prev;
                    tail.next = null;
                } else {

                    DoubleLinkNode prev = temp.prev;
                    DoubleLinkNode next = temp.next;
                    prev.next = next;
                    next.prev = prev;
                    temp = null;
                    size--;
                    return;
                }

            }
            tempindex++;
            temp = temp.next;
        }

        size--;
    }
}
