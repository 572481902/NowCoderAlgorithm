package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class ChooseSort0002 {

    public void sortFun(Integer[] beSortedArr) {

        int k = 0;
        int minNum = -100000;

        for (int i = 0; i < beSortedArr.length - 1; ++i) {

            k = i;
            minNum = beSortedArr[i];

            for (int j = i + 1; j < beSortedArr.length; ++j) {

                if (minNum > beSortedArr[j]) {

                    k = j;
                    minNum = beSortedArr[j];

                }

            }

            int temp;

            temp = beSortedArr[i];
            beSortedArr[i] = beSortedArr[k];
            beSortedArr[k] = temp;

        }

    }


    @Test
    public void testSortFun() {

        Integer[] integers = AlgorithmUtils.genDisorderArr();

        sortFun(integers);

        AlgorithmUtils.arrPrint(integers);

        sortFun(integers);

    }

}
