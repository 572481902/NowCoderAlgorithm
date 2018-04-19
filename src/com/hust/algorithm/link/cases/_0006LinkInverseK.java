package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

import java.util.Stack;

public class _0006LinkInverseK {

    public LinkedListNode<Integer> inverseK(LinkedListNode<Integer> headNode, int k) {

        if (headNode == null || headNode.next == null || k <= 1) return headNode;

        int tempK = k;
        LinkedListNode<Integer> resultHead = null;
        LinkedListNode<Integer> resultTail = null;

        LinkedListNode<Integer> cursor = headNode;

        Stack<LinkedListNode> assist = new Stack<>();

        while (true) {

            if (tempK > 0 && cursor != null) {

                assist.push(cursor);

                cursor = cursor.next;

                --tempK;

            } else {

                while (!assist.isEmpty()) {

                    if (resultHead == null) {

                        resultHead = assist.pop();

                        resultTail = resultHead;

                    } else {

                        resultTail.next = assist.pop();

                        resultTail = resultTail.next;

                    }

                }

                if (cursor == null) {

                    break;

                }

                tempK = k;

            }

        }

        resultTail.next = null;

        return resultHead;

    }


    @Test
    public void testInverseK() {

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

        AlgorithmUtils.printLinedList(inverseK(node00, 2));

    }

}
