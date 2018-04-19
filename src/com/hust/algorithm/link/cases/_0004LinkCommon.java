package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _0004LinkCommon {

    public List<Integer> findCommonEle(LinkedListNode<Integer> headNode1, LinkedListNode<Integer> headNode2) {

        if (headNode1 == null || headNode2 == null) return null;

        LinkedListNode<Integer> cursor1 = headNode1;
        LinkedListNode<Integer> cursor2 = headNode2;

        List<Integer> result = new ArrayList<>();

        while (cursor1 != null && cursor2 != null) {

            if (cursor1.data == cursor2.data) {

                result.add(cursor1.data);

                cursor1 = cursor1.next;
                cursor2 = cursor2.next;

            } else if (cursor1.data > cursor2.data) {

                cursor2 = cursor2.next;

            } else if (cursor1.data < cursor2.data) {

                cursor1 = cursor1.next;

            }

        }

        return result;

    }


    @Test
    public void testFindCommonEle() {

        LinkedListNode<Integer> node09 = new LinkedListNode<>(9, null);
        LinkedListNode<Integer> node08 = new LinkedListNode<>(4, node09);
        LinkedListNode<Integer> node07 = new LinkedListNode<>(3, node08);
        LinkedListNode<Integer> node06 = new LinkedListNode<>(2, node07);
        LinkedListNode<Integer> node05 = new LinkedListNode<>(1, node06);

        LinkedListNode<Integer> node04 = new LinkedListNode<>(8, null);
        LinkedListNode<Integer> node03 = new LinkedListNode<>(7, node04);
        LinkedListNode<Integer> node02 = new LinkedListNode<>(3, node03);
        LinkedListNode<Integer> node01 = new LinkedListNode<>(1, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<>(0, node01);

        System.out.println(findCommonEle(node00, node05));

    }


}
