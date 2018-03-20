package com.hust.algorithm.sort.cases;

import com.hust.algorithm.sort._0006HeapSort;
import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

/**
 *
 * 请设计一个高效算法，判断数组中是否有重复值。必须保证额外空间复杂度为O(1)。
 * 给定一个int数组A及它的大小n，请返回它是否有重复值。
 * 测试样例：
 * [1,2,3,4,5,5,6],7
 * 返回：true
 *
 */

public class _0011CheckerHeap {

    public boolean checkDuplicate(int[] inputArr, int arrLength) {

         _0006HeapSort heapSort = new _0006HeapSort();

        heapSort.sortFun(AlgorithmUtils.toIntegerArr(inputArr), arrLength);

        //heapSort(inputArr);

        for (int i = 1; i < arrLength; i++) {

            if (inputArr[i - 1] == inputArr[i]) {

                return true;

            }

        }

        return false;

    }



    public void heapSort(int[] arr) {

        int arrLength = arr.length;

        buildHeap(arr, arr.length);

        for (int i = arrLength - 1; i > 0; --i) {

            int minValue = arr[0];
            arr[0] = arr[i];
            arr[i] = minValue;

            buildHeap(arr, i);

        }

    }

    public void buildHeap(int[] arr, int arrLength) {

        for (int i = arrLength / 2 - 1; i >= 0; i--) {

            adjustHeap(arr, i, arrLength - 1);

        }



    }

    public void adjustHeap(int[] arr, int lowIndex, int highIndex) {

        int currentIndex = lowIndex;
        int minIndex = highIndex * 2 + 1;

        while (minIndex <= highIndex) {

            if (minIndex < highIndex && arr[minIndex] > arr[minIndex + 1]) {

                ++minIndex;

            }

            if (arr[currentIndex] > arr[minIndex]) {

                AlgorithmUtils.swapIntegerPosition(arr, currentIndex, minIndex);

                currentIndex = minIndex;

                minIndex = currentIndex * 2 + 1;

            } else {

                break;

            }

        }

    }


    @Test
    public void testCheckDuplicate() {

        int[] inputArr1 = {1, 2, 6, 3, 4, 5, 7, 8, 9, 10};
        int[] inputArr2 = {1, 7, 2, 3, 4, 5, 6, 7, 9, 10};

        System.out.println(checkDuplicate(inputArr1, inputArr1.length));
        System.out.println(checkDuplicate(inputArr2, inputArr2.length));

    }

}
