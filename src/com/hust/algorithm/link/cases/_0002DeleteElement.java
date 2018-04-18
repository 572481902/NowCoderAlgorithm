package com.hust.algorithm.link.cases;

import com.hust.algorithm.datastructure.LinkedListNode;
import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class _0002DeleteElement {

    public LinkedListNode deleteElement(LinkedListNode<Integer> head, LinkedListNode<Integer> beDelEle) {

        Integer data = beDelEle.data;

        if (beDelEle.next == null) {

            beDelEle = null;

        } else {

            beDelEle.data = beDelEle.next.data;

            beDelEle.next = beDelEle.next.next;

        }

        return head;

    }


    @Test
    public void testDeleteElement() {

        LinkedListNode<Integer> node09 = new LinkedListNode<Integer>(9, null);
        LinkedListNode<Integer> node08 = new LinkedListNode<Integer>(8, node09);
        LinkedListNode<Integer> node07 = new LinkedListNode<Integer>(7, node08);
        LinkedListNode<Integer> node06 = new LinkedListNode<Integer>(6, node07);
        LinkedListNode<Integer> node05 = new LinkedListNode<Integer>(5, node06);
        LinkedListNode<Integer> node04 = new LinkedListNode<Integer>(4, node05);
        LinkedListNode<Integer> node03 = new LinkedListNode<Integer>(3, node04);
        LinkedListNode<Integer> node02 = new LinkedListNode<Integer>(2, node03);
        LinkedListNode<Integer> node01 = new LinkedListNode<Integer>(1, node02);
        LinkedListNode<Integer> node00 = new LinkedListNode<Integer>(0, node01);

        AlgorithmUtils.printLinedList(node00);

        deleteElement(node00, node03);

        AlgorithmUtils.printLinedList(node00);

    }

}
