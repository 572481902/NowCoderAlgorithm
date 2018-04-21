package com.hust.algorithm.binarysearch.cases;

import com.hust.algorithm.datastructure.BinaryTree;
import org.junit.Test;

public class _0005CompleteBTreeNum {

    public int getBTreeNum(BinaryTree binaryTree) {

        if (binaryTree == null) return 0;

        int treeHeight = 0;
        int leftTreeHeight = 0;
        int rightTreeHeight = 0;

        int leftTreeNum = 0;
        int rightTreeNum = 0;

        BinaryTree assistCursor = binaryTree;

        while (assistCursor != null) {

            ++treeHeight;

            assistCursor = assistCursor.leftChild;

        }

        leftTreeHeight = treeHeight - 1;

        assistCursor = binaryTree.rightChild;

        while (assistCursor != null) {

            ++rightTreeHeight;

            assistCursor = assistCursor.leftChild;

        }



        if (leftTreeHeight == rightTreeHeight) {

            leftTreeNum = (int) Math.pow(2, leftTreeHeight) - 1;

            rightTreeNum = getBTreeNum(binaryTree.rightChild);

            return leftTreeNum + rightTreeNum + 1;

        } else {

            leftTreeNum = getBTreeNum(binaryTree.leftChild);

            rightTreeNum = (int) Math.pow(2, rightTreeHeight) - 1;

            return leftTreeNum + rightTreeNum + 1;

        }
    }


    @Test
    public void testGetBTreeNum() {

        BinaryTree binaryTree00 = new BinaryTree(0);

        System.out.println(getBTreeNum(binaryTree00));

    }

}
