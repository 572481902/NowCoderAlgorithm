package com.hust.algorithm.link.cases;

import org.junit.Test;

public class _0008RandomLinkCopy {

    public class RandomLinkedList {

        public Integer data;
        public RandomLinkedList next;
        public RandomLinkedList random;

        public RandomLinkedList() {
        }

        public RandomLinkedList(Integer data) {
            this.data = data;
        }

        public RandomLinkedList(Integer data, RandomLinkedList next) {
            this.data = data;
            this.next = next;
        }

        public RandomLinkedList(Integer data, RandomLinkedList next, RandomLinkedList random) {
            this.data = data;
            this.next = next;
            this.random = random;
        }
    }

    public RandomLinkedList copyNodeNext(RandomLinkedList srcHeader) {

        if (srcHeader != null) {

            return new RandomLinkedList(srcHeader.data, srcHeader.next);

        } else {

            return null;

        }

    }

    public RandomLinkedList copyNodeAll (RandomLinkedList srcHeader) {

        if (srcHeader != null) {

            return new RandomLinkedList(srcHeader.data, srcHeader.next, srcHeader.random);

        } else {

            return null;

        }

    }

    public RandomLinkedList copyLinkedList (RandomLinkedList srcHeader) {

        if (srcHeader == null || srcHeader.next == null) return copyNodeAll(srcHeader);

        RandomLinkedList cursor = srcHeader;

        while (cursor != null) {

            RandomLinkedList _copyNode = copyNodeNext(cursor);

            cursor.next = _copyNode;

            cursor = _copyNode.next;

        }

        RandomLinkedList srcCursor  = srcHeader;
        RandomLinkedList copyCursor = srcHeader.next;
        RandomLinkedList resultCursor = srcHeader.next;

        while (copyCursor != null) {

            copyCursor.random = srcCursor.random.next;

            srcCursor = copyCursor.next;

            if (srcCursor == null) break;

            copyCursor = srcCursor.next;
        }

        srcCursor  = srcHeader;
        copyCursor = srcHeader.next;

        while (copyCursor != null) {

            srcCursor.next = copyCursor.next;
            srcCursor = srcCursor.next;

            if (srcCursor == null) break;

            copyCursor.next = srcCursor.next;
            copyCursor = copyCursor.next;

        }

        return resultCursor;

    }


    @Test
    public void testCopyLinkedList() {

        RandomLinkedList node02 = node02 = new RandomLinkedList(2, null);
        RandomLinkedList node01 = node01 = new RandomLinkedList(1, node02);
        RandomLinkedList node00 = node00 = new RandomLinkedList(0, node01);

        node00.random = node02;
        node01.random = node00;
        node02.random = node01;

        RandomLinkedList randomLinkedList = copyLinkedList(node00);
    }

}
