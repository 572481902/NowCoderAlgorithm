package com.hust.algorithm.sort.cases;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

import java.util.Arrays;

public class _0010ScaleSort {

    public int[] sortFun(int[] beSortedArr, int arrLength, int k) {

        if (beSortedArr == null || arrLength < k) {

            return null;

        }

        int[] kArr = Arrays.copyOf(beSortedArr, k);

        buildMinHeap(kArr, k);

        for (int i = 0; i < arrLength - k; ++i) {

            beSortedArr[i] = kArr[0];

            kArr[0] = beSortedArr[i + k];

            buildMinHeap(kArr, k);

        }

        while (k > 0) {

            beSortedArr[arrLength - k] = kArr[0];

            kArr[0] = kArr[k - 1];

            buildMinHeap(kArr, k);

            --k;

        }

        return beSortedArr;

    }

    public void buildMinHeap(int[] arr, int arrLenth) {

        for (int i = arrLenth / 2 - 1; i >= 0 ; i--) {

            adjustMinHeap(arr, i, arrLenth - 1);

        }

    }

    public void adjustMinHeap(int[] arr, int low, int high) {

        int currentNode = low;
        int minNode = low * 2 + 1;

        while (minNode <= high) {

            if (minNode < high && arr[minNode] > arr[minNode + 1]) {

                ++minNode;

            }

            if (arr[currentNode] > arr[minNode]) {

                AlgorithmUtils.swapIntegerPosition(arr, minNode, currentNode);

                currentNode = minNode;

                minNode = currentNode * 2 + 1;

            } else {

                break;

            }

        }

    }


    @Test
    public void testSortFun() {

        int[] beSortedArr = {2,2,4,3,6,5,8,7,10,9,11,12,14,15,12};

        int k = 3;

        int[] ints = sortFun(beSortedArr, beSortedArr.length, k);

        for (int temp : ints) {
            System.out.print(temp + "\t");
        }

    }

}
