package com.hust.algorithm.sort.cases;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

/**
 * 2.15 有序数组合并练习题
 * 有两个从小到大排序以后的数组A和B，其中A的末端有足够的缓冲空容纳B。请编写一个方法，将B合并入A并排序。
 * 给定两个有序int数组A和B，A中的缓冲空用0填充，同时给定A和B的真实大小int n和int m，请返回合并后的数组。
 *
 */
public class _0012MergeOrderArr {

    public void mergeOrderArr(int[] orderArr1, int arr1Num, int[] orderArr2, int arr2Num) {

        int arr1Length = orderArr1.length;

        int cursor1 = arr1Num - 1;
        int cursor2 = arr2Num - 1;

        int tailCursor = arr1Length - 1;

        while (cursor1 >=0 && cursor2 >=0 && tailCursor >=0) {

            int result = orderArr1[cursor1] - orderArr2[cursor2];

            if (result > 0) {

                orderArr1[tailCursor--] = orderArr1[cursor1--];

            } else {

                orderArr1[tailCursor--] = orderArr2[cursor2--];

            }

        }

    }


    @Test
    public void testMergeOrderArr() {

        int[] arr1 = {1, 8, 9, 0, 0, 0};
        int[] arr2 = {3, 6, 10};

        mergeOrderArr(arr1, 3, arr2, 3);

        AlgorithmUtils.arrIntPrint(arr1);

    }

}
