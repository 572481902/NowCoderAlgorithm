package com.hust.algorithm.binarysearch.cases;

import org.junit.Test;

public class _0004LeftmostIndex {

    public int getMinIndex(int[] array, int leftIndex, int rightIndex) {

        if (array == null || leftIndex > rightIndex || leftIndex < 0 || rightIndex > array.length - 1) return -1;

        int result = -1;

        int length = array.length;

        if (leftIndex > array[rightIndex]) return -1;

        if (rightIndex < array[leftIndex]) return -1;

        int mid = leftIndex + (rightIndex - leftIndex) / 2;

        if (array[mid] < mid) {

            return getMinIndex(array, mid, rightIndex);

        } else if (array[mid] > mid) {

            return getMinIndex(array, leftIndex, mid - 1);

        } else {

            result = mid;

            int temp = getMinIndex(array, leftIndex, mid - 1);

            if (temp != -1) result  = temp;
        }

        return result;

    }


    @Test
    public void testGetMinIndex() {

        int[] array00 = {-1,  0, 1, 3, 4, 5};
        int[] array01 = {-3, -1, 1, 2, 4, 10};
        int[] array02 = {0, 1, 2, 3, 4, 5, 6};

        System.out.println(getMinIndex(array00, 0, array00.length - 1));
        System.out.println(getMinIndex(array01, 0, array01.length - 1));
        System.out.println(getMinIndex(array02, 0, array02.length - 1));

    }

}
