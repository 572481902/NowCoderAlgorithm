package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import org.junit.Test;

import java.util.Stack;

public class _0007PalindromeLink {

    public boolean isPalindrome(LinkedListNode<Integer> headNode) {

        if (headNode == null) return false;

        if (headNode.next == null) return true;

        Stack<Integer> assistStack = new Stack<>();

        LinkedListNode<Integer> oneStepCursor = headNode;
        LinkedListNode<Integer> twoStepCursor = headNode;

        assistStack.push(oneStepCursor.data);

        while (twoStepCursor != null) {

            oneStepCursor = oneStepCursor.next;

            if (twoStepCursor.next != null && twoStepCursor.next.next != null) {

                twoStepCursor = twoStepCursor.next.next;

            } else {

                twoStepCursor = null;

            }

            if (twoStepCursor != null && twoStepCursor.next != null) {

                assistStack.push(oneStepCursor.data);

            }

        }

        while (oneStepCursor != null) {

            if (assistStack.pop() != oneStepCursor.data) return false;

            oneStepCursor = oneStepCursor.next;

        }

        return true;

    }


    @Test
    public void testIsPalindrome() {

/*        LinkedListNode<Integer> node09 = new LinkedListNode<>(0, null);
        LinkedListNode<Integer> node08 = new LinkedListNode<>(1, node09);
        LinkedListNode<Integer> node07 = new LinkedListNode<>(2, node08);
        LinkedListNode<Integer> node06 = new LinkedListNode<>(3, node07);
        LinkedListNode<Integer> node05 = new LinkedListNode<>(4, node06);
        LinkedListNode<Integer> node04 = new LinkedListNode<>(4, node05);*/
        LinkedListNode<Integer> node03 = new LinkedListNode<>(0, null);
        LinkedListNode<Integer> node02 = new LinkedListNode<>(0, node03);
        LinkedListNode<Integer> node01 = new LinkedListNode<>(0, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<>(1, node01);

        System.out.println(isPalindrome(node00));

    }

}
