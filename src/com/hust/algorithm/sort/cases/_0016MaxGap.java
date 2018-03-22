package com.hust.algorithm.sort.cases;

import org.junit.Test;

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
