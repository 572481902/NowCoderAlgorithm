package com.hust.algorithm.link;

import com.hust.algorithm.datastructure.LinkedListNode;
import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

/**
 * 链表原地逆序
 */
public class _0001LinkListReverse {

    public LinkedListNode reverse(LinkedListNode head) {

        if (head == null || head.next == null) return head;

        LinkedListNode headNode = head;
        LinkedListNode curNode = headNode.next;

        while (headNode.next != null) {

            if (curNode.next == null) {

               curNode.next = headNode;

               headNode = curNode;

               break;

            } else {

                LinkedListNode tempNode = curNode;

                curNode = curNode.next;

                tempNode.next = headNode;

                headNode = tempNode;

            }

        }

        head.next = null;

        return headNode;

    }


    @Test
    public void testReverse() {

        LinkedListNode<Integer> node09 = new LinkedListNode<>(9, null);
        LinkedListNode<Integer> node08 = new LinkedListNode<>(8, node09);
        LinkedListNode<Integer> node07 = new LinkedListNode<>(7, node08);
        LinkedListNode<Integer> node06 = new LinkedListNode<>(6, node07);
        LinkedListNode<Integer> node05 = new LinkedListNode<>(5, node06);
        LinkedListNode<Integer> node04 = new LinkedListNode<>(4, node05);
        LinkedListNode<Integer> node03 = new LinkedListNode<>(3, node04);
        LinkedListNode<Integer> node02 = new LinkedListNode<>(2, node03);
        LinkedListNode<Integer> node01 = new LinkedListNode<>(1, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<>(0, node01);

        AlgorithmUtils.printLinedList(node00);

        LinkedListNode resultHead = reverse(node00);

        AlgorithmUtils.printLinedList(resultHead);

    }

}
