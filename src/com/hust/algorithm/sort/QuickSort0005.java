package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class QuickSort0005 {

    public void sortFun(Integer[] beSortedArr, int startIndex, int endIndex) {

        int i = startIndex;
        int j = endIndex;

        int selectedIndex = startIndex;

        if (i < j) {

            while (true) {

                while (beSortedArr[selectedIndex] <= beSortedArr[j] && i < j)
                    --j;

                if (i < j) {

                    int temp = beSortedArr[selectedIndex];
                    beSortedArr[selectedIndex] = beSortedArr[j];
                    beSortedArr[j] = temp;

                    selectedIndex = j;

                } else {

                    break;

                }

                while (beSortedArr[selectedIndex] >= beSortedArr[i] && i < j)
                    ++i;

                if (i < j) {

                    int temp = beSortedArr[selectedIndex];
                    beSortedArr[selectedIndex] = beSortedArr[i];
                    beSortedArr[i] = temp;

                    selectedIndex = i;

                } else {

                    break;

                }

            }

            sortFun(beSortedArr, startIndex, selectedIndex - 1);
            sortFun(beSortedArr, selectedIndex + 1, endIndex);

        }

    }

    @Test
    public void testSortFun() {

        Integer[] integers = AlgorithmUtils.genDisorderArr();

        AlgorithmUtils.arrPrint(integers);

        System.out.println("----");

        sortFun(integers, 0, integers.length - 1);

        AlgorithmUtils.arrPrint(integers);

    }

}
