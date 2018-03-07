package com.hust.algorithm.sort;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class _0007ShellSort {

    public void sortFun(Integer[] beSortedArr) {

        for (int steps = getInitSteps(beSortedArr, 3); steps >= 1; steps /= 3) {

            for (int i = steps; i < beSortedArr.length; ++i) {

                for (int j = i - steps; j >= 0 && beSortedArr[j + steps] < beSortedArr[j]; j -= steps) {

                    AlgorithmUtils.swapIntegerPosition(beSortedArr, j + steps, j);
                    AlgorithmUtils.arrPrint(beSortedArr);
                }

            }

        }

    }

    public int getInitSteps(Integer[] arr, int property) {

        int result = 0;

        while (result < arr.length / property) {

            result = result * property + 1;

        }

        System.out.println(result);

        return result;

    }

    @Test
    public void testSortFun() {

        Integer[] integers = AlgorithmUtils.genDisorderArr();

        AlgorithmUtils.arrPrint(integers);

        sortFun(integers);

        AlgorithmUtils.arrPrint(integers);

    }

}
