package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class _0009RadixSort {

    public int[] sortFun(int[] beSortedArr, int digit, int maxLength) {

        if (digit > maxLength) {

            return beSortedArr;

        }

        int radix = 10;
        int arrLength = beSortedArr.length;

        int[] count = new int[radix];
        int[] bucket = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {

            count[getDigit(beSortedArr[i], digit)]++;

        }

        for (int i = 1; i < count.length; i++) {

            count[i] = count[i] + count[i-1];

        }

        for (int i = arrLength - 1; i >= 0; --i) {

            int temp = beSortedArr[i];

            bucket[count[getDigit(temp, digit)] - 1] = temp;

            count[getDigit(temp, digit)]--;

        }

        return sortFun(bucket, digit + 1, maxLength);

    }

    public int getDigit(int num, int digit) {

        int[] arr = new int[]{1, 10, 100, 1000, 1000, 10000, 100000};

        return ((num / arr[digit]) % 10);

    }


    @Test
    public void testSortFun() {

        Integer[] disOrderArr = AlgorithmUtils.genDisorderArr();

        int[] arr = AlgorithmUtils.toIntArr(disOrderArr);

        int[] ints = sortFun(arr, 0, 5);

        Integer[] integers = AlgorithmUtils.toIntegerArr(ints);

        AlgorithmUtils.arrPrint(integers);


    }

}
