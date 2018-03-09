package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class _0008CountSort {

    public Integer[] sortFun(Integer[] beSortedArr) {

        if (beSortedArr == null && beSortedArr.length < 1) {

            return null;

        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < beSortedArr.length; ++i) {

            max = Math.max(max, beSortedArr[i]);
            min = Math.min(min, beSortedArr[i]);

        }

        int[] assistArr = new int[max - min + 1];

        for (int i = 0; i < beSortedArr.length; ++i) {

            int temp = beSortedArr[i];

            assistArr[temp - min]++;

        }

        int[] resultArr = new int[beSortedArr.length];
        int j = 0;
        for (int i = 0; i < assistArr.length; ++i) {

            while (assistArr[i] > 0) {

                resultArr[j++] = i + min;
                assistArr[i]--;

            }

        }

        return AlgorithmUtils.toIntegerArr(resultArr);
    }


    @Test
    public void testSortFun() {

        Integer[] integers = AlgorithmUtils.genDisorderArr();

        AlgorithmUtils.arrPrint(integers);

        AlgorithmUtils.arrPrint(sortFun(integers));

    }
}
