package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class _0006HeapSort {

    public void sortFun(Integer[] beSortedArr, int arrLength) {

        for (int i = arrLength / 2; i >= 0; --i) {

            adjustHeap(beSortedArr, i, arrLength - 1);

        }

        for (int i = arrLength - 1; i >= 1; --i) {

            AlgorithmUtils.swapIntegerPosition(beSortedArr, 0, i);

            adjustHeap(beSortedArr, 0, i - 1);

        }



    }

    public void adjustHeap(Integer[] arr, int low, int high) {

        int i = low;
        int j = i * 2 + 1;

        while (j <= high) {

            if (j < high && arr[j] < arr[j + 1]) ++j;

            if (arr[i] < arr[j]) {

                AlgorithmUtils.swapIntegerPosition(arr, i, j);

                i = j;
                j = 2 * i + 1;

            } else {

                break;

            }

        }

    }


    @Test
    public void testSortFun() {

        Integer[] integers = AlgorithmUtils.genDisorderArr();

        AlgorithmUtils.arrPrint(integers);

        sortFun(integers, integers.length);

        AlgorithmUtils.arrPrint(integers);

    }

}
