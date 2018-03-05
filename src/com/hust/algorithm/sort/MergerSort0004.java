package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class MergerSort0004 {

    public void mergeArr(Integer[] arr, int startIndex, int midIndex, int endIndex) {

        int i = startIndex;
        int j = midIndex + 1;
        int k = 0;

        Integer[] temp = new Integer[endIndex - startIndex + 1];

        while (i <= midIndex && j <= endIndex) {

            if (arr[i] < arr[j]) {

                temp[k++] = arr[i++];

            } else {

                temp[k++] = arr[j++];

            }

        }

        while (i <= midIndex)
            temp[k++] = arr[i++];

        while (j <= endIndex)
            temp[k++] = arr[j++];


        for (int l = startIndex, m = 0; l <= endIndex; l++) {

            arr[l] = temp[m++];

        }

    }

    public  void sortFun(Integer[] beSortedArr, int startIndex, int endIndex) {


        if (startIndex < endIndex) {

            int midIndex = (startIndex + endIndex) / 2;

            sortFun(beSortedArr, startIndex, midIndex);
            sortFun(beSortedArr, midIndex + 1, endIndex);

            mergeArr(beSortedArr, startIndex, midIndex, endIndex);

        }

    }



    @Test
    public void testSortFun() {

        Integer[] integers = AlgorithmUtils.genDisorderArr();

        AlgorithmUtils.arrPrint(integers);

        System.out.println();

        sortFun(integers, 0, integers.length - 1);

        AlgorithmUtils.arrPrint(integers);

    }

}
