package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class _0005DeleteSameElement {

    public LinkedListNode<Integer> delete(LinkedListNode<Integer> headNode, int num) {

        if (headNode == null) return headNode;

        LinkedListNode<Integer> newHeader = null;
        LinkedListNode<Integer> tailNode = null;

        LinkedListNode<Integer> currNode = headNode;

        while (currNode != null) {

            if (currNode.data != num) {

                if (newHeader == null) {

                    newHeader = currNode;
                    tailNode = currNode;

                } else {

                    tailNode.next = currNode;

                    tailNode = tailNode.next;

                }

            }

            currNode = currNode.next;

        }

        if (tailNode != null) {

            tailNode.next = null;

        }

        return newHeader;

    }


    @Test
    public void testDelete() {

        LinkedListNode<Integer> node09 = new LinkedListNode<>(3, null);
        LinkedListNode<Integer> node08 = new LinkedListNode<>(3, node09);
        LinkedListNode<Integer> node07 = new LinkedListNode<>(3, node08);
        LinkedListNode<Integer> node06 = new LinkedListNode<>(3, node07);
        LinkedListNode<Integer> node05 = new LinkedListNode<>(5, node06);
        LinkedListNode<Integer> node04 = new LinkedListNode<>(4, node05);
        LinkedListNode<Integer> node03 = new LinkedListNode<>(3, node04);
        LinkedListNode<Integer> node02 = new LinkedListNode<>(2, node03);
        LinkedListNode<Integer> node01 = new LinkedListNode<>(1, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<>(0, node01);

        AlgorithmUtils.printLinedList(node00);

        AlgorithmUtils.printLinedList(delete(node00, 3));

    }
}
