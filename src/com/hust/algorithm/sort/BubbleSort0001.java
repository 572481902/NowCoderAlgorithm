package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class BubbleSort0001 {

    public void sortFun(Integer[] arr) {

        for (int i = 0; i < arr.length - 1; ++i) {

            boolean flag = true;

            for (int j = i + 1; j < arr.length; ++j) {

                if (arr[j] < arr[i]) {

                    int temp;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    flag = false;

                }

            }

            if (flag) {

                return ;

            }

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
