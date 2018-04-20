package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import org.junit.Test;

public class _0009JudgeRingLink {

    public LinkedListNode isRingLink(LinkedListNode headNode) {

        if (headNode == null || headNode.next == null) return null;

        LinkedListNode fastCursor = headNode;
        LinkedListNode slowCursor = headNode;

        while (fastCursor != null) {

            if (fastCursor.next == null) return null;

            fastCursor = fastCursor.next.next;
            slowCursor = slowCursor.next;

            if (fastCursor == slowCursor) {

                fastCursor = headNode;

                break;

            }

        }

        if (fastCursor == null) return null;

        while (fastCursor != slowCursor) {

            fastCursor = fastCursor.next;
            slowCursor = slowCursor.next;

        }

        return fastCursor;

    }


    @Test
    public void testIsRingLink() {

        LinkedListNode<Integer> node04 = new LinkedListNode<>(4);
        LinkedListNode<Integer> node03 = new LinkedListNode<>(3, node04);
        LinkedListNode<Integer> node02 = new LinkedListNode<>(2, node03);
        LinkedListNode<Integer> node01 = new LinkedListNode<>(1, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<>(0, node01);

        node04.next = node02;

        LinkedListNode ringLink = isRingLink(node00);

        System.out.println();

    }
}
