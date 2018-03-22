package com.hust.algorithm.sort.cases;

import org.junit.Test;


/**
 *  2.19 最短子数组练习题
 *  对于一个数组，请设计一个高效算法计算需要排序的最短子数组的长度。
 *  给定一个int数组A和数组的大小n，请返回一个二元组，代表所求序列的长度。(原序列位置从0开始标号,若原序列有序，返回0)。保证A中元素均为正整数。
 *  测试样例：
 *  [1,4,6,5,9,10],6
 *  返回：2
 *
 */
public class _0015ShortestSubsequence {

    public int subsequenceLength (int[] inputArr, int length) {

        int leftCursor = 0;
        int rightCursor = length - 1;

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < inputArr.length; ++i) {

            if (maxNum < inputArr[i]) {

                maxNum = inputArr[i];

            } else {

                leftCursor = i;

            }

            if (minNum > inputArr[length - i - 1]) {

                minNum = inputArr[length - i - 1];

            } else {

                rightCursor = length - i - 1;

            }

        }

        System.out.println("leftIndex : " + leftCursor);
        System.out.println("rightIndex : " + rightCursor);

        return leftCursor - rightCursor + 1;

    }


    @Test
    public void testSubsequenceLength() {

        int[] inputArr = {1, 11, 6, 5, 9, 10};

        System.out.println(subsequenceLength(inputArr, inputArr.length));

    }

}
