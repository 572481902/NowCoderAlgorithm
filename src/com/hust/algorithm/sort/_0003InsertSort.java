package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class _0003InsertSort {

    public void sortFun(Integer[] beSortedArr) {

        for (int i = 1; i < beSortedArr.length; ++i) {

            int temp = beSortedArr[i];

            for (int j = i - 1; j >= 0; --j) {

                if (temp < beSortedArr[j]) {

                    beSortedArr[j + 1] = beSortedArr[j];

                } else {

                    beSortedArr[j + 1] = temp;

                    break;

                }

                if (j == 0) {

                    beSortedArr[0] = temp;

                }

            }

        }

    }


    @Test
    public void testSortFun() {

        Integer[] integers = AlgorithmUtils.genDisorderArr();

        AlgorithmUtils.arrPrint(integers);

        System.out.println();

        sortFun(integers);

        AlgorithmUtils.arrPrint(integers);

    }

}
