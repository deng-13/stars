package com.star.algorithm.leecode.common;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-08-15
 * @author： xingxingzhao
 */
public class DoubleLinkNode {

    public DoubleLinkNode prev;
    public int value;
    public DoubleLinkNode next;

    public DoubleLinkNode(DoubleLinkNode prev, int value, DoubleLinkNode next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

}
