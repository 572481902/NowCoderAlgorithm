package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import org.junit.Test;

public class _0011RingLinkIntersect {

    public LinkedListNode ringNode(LinkedListNode headNode) {

        _0009JudgeRingLink judgeRingLink = new _0009JudgeRingLink();

        return judgeRingLink.isRingLink(headNode);
    }

    public LinkedListNode intersectNode(LinkedListNode header1, LinkedListNode header2, LinkedListNode node) {

        if (header1 == null || header2 == null) return null;

        int listLength1 = 0;
        int listLength2 = 0;

        LinkedListNode cursor1 = header1;
        LinkedListNode cursor2 = header2;

        while (cursor1 != node) {

            ++listLength1;

            cursor1 = cursor1.next;

        }

        while (cursor2 != node) {

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

        while (cursor1 != node && cursor2 != node) {

            if (cursor1 == cursor2) {

                return cursor1;

            }

            cursor1 = cursor1.next;
            cursor2 = cursor2.next;

        }

        return node;

    }


    public LinkedListNode intersectResultNode(LinkedListNode header1, LinkedListNode header2) {

        LinkedListNode ringNode1 = ringNode(header1);
        LinkedListNode ringNode2 = ringNode(header2);

        if (ringNode1 == ringNode2) {

            return intersectNode(header1, header2, ringNode1);

        } else {

            LinkedListNode currNode = ringNode1;

            currNode = currNode.next;

            while (currNode != ringNode1) {

                if (currNode == ringNode2) {

                    return ringNode2;

                }

                currNode = currNode.next;
            }

            return null;

        }

    }


    @Test
    public void testIntersectNode() {

        //Case01
/*

        LinkedListNode node00 = new LinkedListNode(0);
        LinkedListNode node01 = new LinkedListNode(1);
        LinkedListNode node02 = new LinkedListNode(2);
        LinkedListNode node03 = new LinkedListNode(3);

        node00.next = node01;
        node01.next = node02;
        node02.next = node03;
        node03.next = node01;

        LinkedListNode node10 = new LinkedListNode(0);
        LinkedListNode node11 = new LinkedListNode(1);
        LinkedListNode node12 = new LinkedListNode(2);
        LinkedListNode node13 = new LinkedListNode(3);

        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node11;

        System.out.println(intersectResultNode(node00, node10));


        //Case02

        LinkedListNode node00 = new LinkedListNode(0);
        LinkedListNode node01 = new LinkedListNode(1);
        LinkedListNode node02 = new LinkedListNode(2);
        LinkedListNode node03 = new LinkedListNode(3);

        node00.next = node01;
        node01.next = node02;
        node02.next = node03;
        node03.next = node01;

        LinkedListNode node10 = new LinkedListNode(0);
        LinkedListNode node11 = new LinkedListNode(1);
        LinkedListNode node12 = new LinkedListNode(2);
        LinkedListNode node13 = new LinkedListNode(3);

        node10.next = node01;
        node11.next = node12;
        node12.next = node13;
        node13.next = node11;

        System.out.println(intersectResultNode(node00, node10).data);

        //Case03


        LinkedListNode node00 = new LinkedListNode(0);
        LinkedListNode node01 = new LinkedListNode(1);
        LinkedListNode node02 = new LinkedListNode(2);
        LinkedListNode node03 = new LinkedListNode(3);
        LinkedListNode node04 = new LinkedListNode(4);

        node00.next = node01;
        node01.next = node02;
        node02.next = node03;
        node03.next = node04;
        node03.next = node02;

        LinkedListNode node10 = new LinkedListNode(0);
        LinkedListNode node11 = new LinkedListNode(1);
        LinkedListNode node12 = new LinkedListNode(2);
        LinkedListNode node13 = new LinkedListNode(3);

        node10.next = node01;
        node11.next = node12;
        node12.next = node13;
        node13.next = node11;

        System.out.println(intersectResultNode(node00, node10).data);
*/
        //Case04

        LinkedListNode node00 = new LinkedListNode(0);
        LinkedListNode node01 = new LinkedListNode(1);
        LinkedListNode node02 = new LinkedListNode(2);
        LinkedListNode node03 = new LinkedListNode(3);
        LinkedListNode node04 = new LinkedListNode(4);

        node00.next = node01;
        node01.next = node02;
        node02.next = node03;
        node03.next = node04;
        node04.next = node02;

        LinkedListNode node10 = new LinkedListNode(0);
        LinkedListNode node11 = new LinkedListNode(1);
        LinkedListNode node12 = new LinkedListNode(2);
        LinkedListNode node13 = new LinkedListNode(3);

        node10.next = node11;
        node11.next = node04;
        node12.next = node13;
        node13.next = node11;

        System.out.println(intersectResultNode(node00, node10).data);

    }

}
