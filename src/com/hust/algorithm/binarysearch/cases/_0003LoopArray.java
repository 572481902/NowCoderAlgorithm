package com.hust.algorithm.binarysearch.cases;

import org.junit.Test;

public class _0003LoopArray {

    public int getMinNum(int[] array, int leftIndex, int rightIndex) {

        if (array == null || leftIndex > rightIndex || leftIndex < 0 || rightIndex > array.length - 1) return -1;

        if (array.length == 1 || leftIndex == rightIndex) return array[leftIndex];

        if (array[leftIndex] < array[rightIndex]) {

            return array[leftIndex];

        } else {

            int mid = leftIndex + (rightIndex - leftIndex) / 2;

            if (array[leftIndex] > array[mid]) {

                return getMinNum(array, leftIndex + 1, mid);

            } else if (array[mid] > array[rightIndex]) {

                return getMinNum(array, mid + 1, rightIndex);

            } else {

                return getMin(array, leftIndex, rightIndex);

            }


        }

    }

    private int getMin(int[] array, int leftIndex, int rightIndex) {

        int minValue = Integer.MAX_VALUE;

        for (int i = leftIndex; i <= rightIndex; ++i) {

            if (minValue > array[i]) {

                minValue = array[i];

            }

        }

        return minValue;
    }


    @Test
    public void testGetMinNum() {

        int[] array00 = {14, 0, 1};
        int[] array01 = {3, 4, 4, 4, 5, 5, 5, 5, 5, 1, 2, 2, 3, 3};
        int[] array02 = {14, 0};
        int[] array03 = {2, 2, 2, 2, 2, 2, 2, 1, 2};

        System.out.println(getMinNum(array00, 0, array00.length - 1));
        System.out.println(getMinNum(array01, 0, array01.length - 1));
        System.out.println(getMinNum(array02, 0, array02.length - 1));
        System.out.println(getMinNum(array03, 0, array03.length - 1));

    }
}
