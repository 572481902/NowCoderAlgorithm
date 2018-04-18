package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

/**
 * 环形链表插值练习题
 * 有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，并且保证这个环形单链表依然有序。
 * 给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，请构造出这个环形链表，并插入该值
 */
public class _0001CircularLinkedList {

    public LinkedListNode insert(LinkedListNode<Integer> beInsertedNode, LinkedListNode<Integer> head) {

        if (head == null) {

            beInsertedNode.next = beInsertedNode;

            return beInsertedNode;

        }

        LinkedListNode<Integer> curNode = head;
        LinkedListNode<Integer> preNode = head.next;


        while (preNode != head) {

            if (curNode.data <= beInsertedNode.data && beInsertedNode.data <= preNode.data) {

                beInsertedNode.next = preNode;

                curNode.next = beInsertedNode;

                break;

            }

            curNode = preNode;
            preNode = preNode.next;

        }

        if (preNode == head) {

            beInsertedNode.next = preNode;

            curNode.next = beInsertedNode;

            if (beInsertedNode.data < preNode.data) {

                head = beInsertedNode;

            }

        }

        return head;
    }


    @Test
    public void testInsert() {

        LinkedListNode<Integer> node09 = new LinkedListNode<>(9, null);
        LinkedListNode<Integer> node08 = new LinkedListNode<>(8, node09);
        LinkedListNode<Integer> node07 = new LinkedListNode<>(7, node08);
        LinkedListNode<Integer> node06 = new LinkedListNode<>(6, node07);
        LinkedListNode<Integer> node05 = new LinkedListNode<>(5, node06);
        LinkedListNode<Integer> node04 = new LinkedListNode<>(4, node05);
        //LinkedListNode node03 = new LinkedListNode(3, node04);
        LinkedListNode<Integer> node02 = new LinkedListNode<>(2, node04);
        LinkedListNode<Integer> node01 = new LinkedListNode<>(1, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<>(0, node01);
        node09.next = node00;

        AlgorithmUtils.printLinedList(node00);

        LinkedListNode resultHead = insert(new LinkedListNode(3, null), node00);

        AlgorithmUtils.printLinedList(resultHead);

    }
}
