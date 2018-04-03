package com.hust.algorithm.sort.cases;

import org.junit.Test;

/**
 * 有一个整形数组A，请设计一个复杂度为O(n)的算法，算出排序后相邻两数的最大差值。
 * 给定一个int数组A和A的大小n，请返回最大的差值。保证数组元素多于1个。
 * 测试样例：
 * [1,2,5,4,6],5
 * 返回：2
 */
public class _0016MaxGap {

    public int findMaxGap(int[] inputArr, int arrLength) {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arrLength; i++) {

            maxValue = Math.max(maxValue, inputArr[i]);
            minValue = Math.min(minValue, inputArr[i]);

        }

        boolean[] existNum = new boolean[arrLength + 1];
        int[] minNums = new int[arrLength + 1];
        int[] maxNums = new int[arrLength + 1];


        for (int i = 0; i < arrLength; i++) {

            int bucketIndex = bucket(maxValue, minValue, inputArr[i], arrLength);

            maxNums[bucketIndex] = existNum[bucketIndex] ? Math.max(maxNums[bucketIndex], inputArr[i]) : inputArr[i];
            minNums[bucketIndex] = existNum[bucketIndex] ? Math.min(minNums[bucketIndex], inputArr[i]) : inputArr[i];

            existNum[bucketIndex] = true;
        }

        int lastMaxNum = 0;
        int i = 0;
        for (; i < arrLength; i++) {

            if (existNum[i]) {

                lastMaxNum = maxNums[i];

                ++i;

                break;

            }

        }

        int result = 0;
        while (i <= arrLength) {

            if (existNum[i]) {

                result = Math.max(result, minNums[i] - lastMaxNum);

                lastMaxNum = maxNums[i];

            }

            ++i;
        }

        return result;

    }

    public int bucket(long maxValue, long minValue, int currentNum, int arrLength) {

        return (int)((currentNum - minValue) * arrLength / (maxValue - minValue));

    }


    @Test
    public void testFindMaxGap() {

        int[] inputArr = {1,2,5,10,6};

        System.out.println(findMaxGap(inputArr, 5));

    }
}
