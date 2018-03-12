package com.hust.algorithm.sort;

public class _0010ScaleSort {

    public void sortFun(int[] beSortedArr, int arrLength, int k) {

        if (beSortedArr == null || arrLength < k) {

            return;

        }



    }

    public void adjustMinHeap(int[] arr, int low, int high) {

        int curIndex = low;
        int minIndex = low * 2 + 1;

        while (minIndex <= high) {

            if (minIndex < high && arr[minIndex] > arr[minIndex + 1]) {

                ++minIndex;

            }

            if (arr[curIndex] > arr[minIndex]) {

                curIndex = minIndex;


            }

        }



    }

}
