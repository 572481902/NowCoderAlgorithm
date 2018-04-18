package com.hust.algorithm.link;

import org.junit.Test;

import java.util.LinkedList;

public class _0001LinkListReverse {

    public static class Node {

        private Integer data;

        private Node next;

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node reverse(Node head) {

        if (head == null || head.next == null) return head;

        Node headNode = head;
        Node curNode = headNode.next;

        while (headNode.next != null) {

            if (curNode.next == null) {

               curNode.next = headNode;

               headNode = curNode;

               break;

            } else {

                Node tempNode = curNode;

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

        Node node09 = new Node(9, null);
        Node node08 = new Node(8, node09);
        Node node07 = new Node(7, node08);
        Node node06 = new Node(6, node07);
        Node node05 = new Node(5, node06);
        Node node04 = new Node(4, node05);
        Node node03 = new Node(3, node04);
        Node node02 = new Node(2, node03);
        Node node01 = new Node(1, node02);
        Node node00 = new Node(0, node01);

        Node resultHead = reverse(node00);

        while (resultHead != null) {

            System.out.println(resultHead.data);

            resultHead = resultHead.next;

        }

    }

}
