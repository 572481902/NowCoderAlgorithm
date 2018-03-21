package com.hust.algorithm.sort.cases;


import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

/**
 * 有一个只由0，1，2三种元素构成的整数数组，请使用交换、原地排序而不是使用计数进行排序。
 * 给定一个只含0，1，2的整数数组A及它的大小，请返回排序后的数组。保证数组大小小于等于500。
 * 测试样例：
 * [0,1,1,0,2,2],6
 * 返回：[0,0,1,1,2,2]
 */

public class _0013NetherlandsFlag {

    public void threeColor(int[] inputArr, int length) {

        int leftCursor = 0;
        int rightCursor = length - 1;
        int currentCursor = 0;

        while (currentCursor < rightCursor) {

            if (inputArr[currentCursor] < 1) {

                AlgorithmUtils.swapIntegerPosition(inputArr, currentCursor++, leftCursor++);

            } else if (inputArr[currentCursor] > 1){

                AlgorithmUtils.swapIntegerPosition(inputArr, currentCursor, rightCursor--);

            } else {

                ++currentCursor;

            }

        }

    }

    @Test
    public void testThreeColor() {

        int[] inputArr = {0, 1 , 1, 2, 0, 1, 2, 2, 1, 0, 1, 2};

        AlgorithmUtils.arrIntPrint(inputArr);
        threeColor(inputArr, inputArr.length);
        AlgorithmUtils.arrIntPrint(inputArr);

    }

}
