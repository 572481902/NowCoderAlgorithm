package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

/**
 * 链表的分化练习题
 * 对于一个链表，我们需要用一个特定阈值完成对它的分化，使得小于等于这个值的结点移到前面，大于该值的结点在后面，同时保证两类结点内部的位置关系不变。
 * 给定一个链表的头结点head，同时给定阈值val，请返回一个链表，使小于等于它的结点在前，大于等于它的在后，保证结点值不重复。
 */
public class _0003LinkDivide {

    public LinkedListNode<Integer> divide(LinkedListNode<Integer> headNode, int num) {

        if (headNode == null) return headNode;

        LinkedListNode<Integer> eqHeadNode = null;
        LinkedListNode<Integer> eqCurrNode = null;

        LinkedListNode<Integer> gtHeadNode = null;
        LinkedListNode<Integer> gtCurrNode = null;

        LinkedListNode<Integer> ltHeadNode = null;
        LinkedListNode<Integer> ltCurrNode = null;

        LinkedListNode<Integer> currentNode = headNode;

        while (currentNode != null) {

            if (currentNode.data == num) {

                if (eqHeadNode == null) {

                    eqHeadNode = currentNode;

                    eqCurrNode = currentNode;

                } else {

                    eqCurrNode.next = currentNode;

                    eqCurrNode = eqCurrNode.next;

                }

            } else if (currentNode.data > num) {

                if (gtHeadNode == null) {

                    gtHeadNode = currentNode;

                    gtCurrNode = currentNode;

                } else {

                    gtCurrNode.next = currentNode;

                    gtCurrNode = gtCurrNode.next;

                }

            } else {

                if (ltHeadNode == null) {

                    ltHeadNode = currentNode;

                    ltCurrNode = currentNode;

                } else {

                    ltCurrNode.next = currentNode;

                    ltCurrNode = ltCurrNode.next;

                }

            }

            currentNode = currentNode.next;

        }

        gtCurrNode.next = eqHeadNode;
        eqCurrNode.next = ltHeadNode;

        ltCurrNode.next = null;

        return gtHeadNode;

    }

    @Test
    public void testDevide() {

        LinkedListNode<Integer> node09 = new LinkedListNode<>(3, null);
        LinkedListNode<Integer> node08 = new LinkedListNode<>(1, node09);
        LinkedListNode<Integer> node07 = new LinkedListNode<>(2, node08);
        LinkedListNode<Integer> node06 = new LinkedListNode<>(9, node07);
        LinkedListNode<Integer> node05 = new LinkedListNode<>(4, node06);
        LinkedListNode<Integer> node04 = new LinkedListNode<>(8, node05);
        LinkedListNode<Integer> node03 = new LinkedListNode<>(3, node04);
        LinkedListNode<Integer> node02 = new LinkedListNode<>(7, node03);
        LinkedListNode<Integer> node01 = new LinkedListNode<>(1, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<>(0,

                node01);

        AlgorithmUtils.printLinedList(divide(node00, 3));

    }

}
