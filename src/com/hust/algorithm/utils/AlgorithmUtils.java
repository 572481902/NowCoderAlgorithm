package com.hust.algorithm.utils;

import java.util.Random;

public class AlgorithmUtils {

    /**
     * 打印数组
     * @param arr : 待打印数组
     */
    public static void arrPrint(Object[] arr) {

        for (int i = 0; i < arr.length; ++i) {

            System.out.print(arr[i] + "\t");

        }

        System.out.println();

    }


    /**
     * 随机生成长度为10的整形数组
     * @return 返回长度为10的整形数组
     */
    public static Integer[] genDisorderArr() {

        Random random = new Random();

        Integer[] result = new Integer[10];

        for (int i = 0; i < 10; ++i) {

            result[i] = random.nextInt(100);

        }

        return result;

    }

    /**
     * 查询出给定数组中最小值，及其索引
     * @param arr   待查询数组
     * @return  返回数组，格式：[index, minNum]
     */
    public Integer[] findMinNumInArr(Integer[] arr) {

        int minNum = -1000000;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (minNum > arr[i]) {

                minNum = arr[i];

                index = i;

            }

        }

        return new Integer[]{index, minNum};

    }


    public static void swapIntegerPosition(Integer[] arr, int firstIndex, int secondIndex) {

        if (firstIndex >=0 && firstIndex <= arr.length - 1 && secondIndex >=0 && secondIndex <= arr.length - 1) {

            int temp = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = temp;

        } else {

            throw new RuntimeException("数组下标有误 ......");

        }


    }

}
