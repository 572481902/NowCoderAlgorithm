package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import org.junit.Test;

public class _0012TwoLinkedIntersect {

    public LinkedListNode function(LinkedListNode header1, LinkedListNode header2) {

        _0009JudgeRingLink judgeRingLink = new _0009JudgeRingLink();

        LinkedListNode intersectNode1 = judgeRingLink.isRingLink(header1);
        LinkedListNode intersectNode2 = judgeRingLink.isRingLink(header2);

        if (intersectNode1 == null && intersectNode2 != null || intersectNode1 != null && intersectNode2 == null) return null;

        if (intersectNode1 == null) {

            _0010JudgeLinkIntersect judgeLinkIntersect = new _0010JudgeLinkIntersect();

            return judgeLinkIntersect.intersectNode(intersectNode1, intersectNode2);

        } else {

            _0011RingLinkIntersect ringLinkIntersect = new _0011RingLinkIntersect();

            return ringLinkIntersect.intersectResultNode(intersectNode1, intersectNode2);

        }


    }


    @Test
    public void testFunction() {

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
        node11.next = node12;
        node12.next = node13;
        node13.next = null;

        System.out.println(function(node00, node10));

    }

}
