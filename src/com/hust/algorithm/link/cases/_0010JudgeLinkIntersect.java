package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import org.junit.Test;

public class _0010JudgeLinkIntersect {

    public LinkedListNode intersectNode(LinkedListNode header1, LinkedListNode header2) {

        if (header1 == null || header2 == null) return null;

        int listLength1 = 0;
        int listLength2 = 0;

        LinkedListNode cursor1 = header1;
        LinkedListNode cursor2 = header2;

        while (cursor1 != null) {

            ++listLength1;

            cursor1 = cursor1.next;

        }

        while (cursor2 != null) {

            ++listLength2;

            cursor2 = cursor2.next;

        }

        cursor1 = header1;
        cursor2 = header2;
        if (listLength1 > listLength2) {

            while (listLength1 > listLength2) {

                --listLength1;

                cursor1 = cursor1.next;

            }

        } else if (listLength1 < listLength2) {

            while (listLength1 < listLength2) {

                --listLength2;

                cursor2 = cursor2.next;

            }

        }

        while (cursor1 != null && cursor2 != null) {

            if (cursor1 == cursor2) {

                return cursor1;

            }

            cursor1 = cursor1.next;
            cursor2 = cursor2.next;

        }

        return null;

    }


    @Test
    public void testIntersectNode() {


        LinkedListNode<Integer> node09 = new LinkedListNode<>(9);
        LinkedListNode<Integer> node08 = new LinkedListNode<>(8, node09);
        LinkedListNode<Integer> node07 = new LinkedListNode<>(7, node08);
        LinkedListNode<Integer> node06 = new LinkedListNode<>(6, node07);
        LinkedListNode<Integer> node05 = new LinkedListNode<>(5, node06);

        LinkedListNode<Integer> node04 = new LinkedListNode<>(4, node09);
        LinkedListNode<Integer> node03 = new LinkedListNode<>(3, node04);
        LinkedListNode<Integer> node02 = new LinkedListNode<>(2, node03);
        LinkedListNode<Integer> node01 = new LinkedListNode<>(1, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<>(0, node01);

        System.out.println(intersectNode(node00, node05).data);


    }
}
