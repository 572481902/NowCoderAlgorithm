package com.hust.algorithm.binarysearch.cases;

import org.junit.Test;

public class _0002LeftmostIndex {

    public int getLeftmostIndex(int[] array, int num, int leftIndex, int rightIndex) {

        if (array == null || leftIndex > rightIndex || leftIndex < 0 || rightIndex > array.length - 1) return -1;

        int mid = leftIndex + (rightIndex - leftIndex) / 2;

        if (array[mid] > num) {

            return getLeftmostIndex(array, num, leftIndex, mid - 1);

        } else if (array[mid] < num){

            return getLeftmostIndex(array, num, mid + 1, rightIndex);

        } else {

            if (mid == 0 || array[mid - 1] < num) return mid;

            return getLeftmostIndex(array, num, leftIndex, mid);

        }

    }


    @Test
    public void testGetLeftmostIndex() {

        int[] array00 = {0};

        System.out.println(getLeftmostIndex(array00, 3, 0, array00.length - 1));

    }

}
