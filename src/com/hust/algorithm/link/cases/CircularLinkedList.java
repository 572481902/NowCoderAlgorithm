package com.hust.algorithm.link.cases;

import org.junit.Test;

import java.util.logging.Handler;

/**
 * 环形链表插值练习题
 * 有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，并且保证这个环形单链表依然有序。
 * 给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，请构造出这个环形链表，并插入该值
 */
public class CircularLinkedList {

    public static class Node {

        private Integer data;

        private Node next;

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node insert(Node beInsertedNode, Node head) {

        if (head == null) {

            beInsertedNode.next = beInsertedNode;

            return beInsertedNode;

        }

        Node curNode = head;
        Node preNode = head.next;


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

        Node node09 = new Node(9, null);
        Node node08 = new Node(8, node09);
        Node node07 = new Node(7, node08);
        Node node06 = new Node(6, node07);
        Node node05 = new Node(5, node06);
        Node node04 = new Node(4, node05);
        //Node node03 = new Node(3, node04);
        Node node02 = new Node(2, node04);
        Node node01 = new Node(1, node02);
        Node node00 = new Node(0, node01);
        node09.next = node00;

        Node resultHead = insert(new Node(3, null), node00);

        System.out.println();

    }
}
