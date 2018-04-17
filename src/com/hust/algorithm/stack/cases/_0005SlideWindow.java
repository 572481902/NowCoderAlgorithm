package com.hust.algorithm.stack.cases;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class _0005SlideWindow {

    /**
     * @param array
     * @param length 数组array长度
     * @param window 窗口大小
     * @return
     */
    public int[] slide(int[] array, int length, int window) {

        if (window > length) {

            Arrays.sort(array);

            return new int[]{array[length - 1]};

        }

        if (window <= 0) {

            return array;

        }

        int[] result = new int[length - window + 1];

        Deque<Integer> qMax = new ArrayDeque<>();

        for (int i = 0; i < length; i++) {

            if (qMax.isEmpty()) {

                qMax.add(i);

            } else if (array[qMax.getLast()] >= array[i]){

                qMax.addLast(i);

            } else {

                qMax.pollLast();

                while (!qMax.isEmpty()) {

                    if(array[qMax.getLast()] < array[i]) qMax.pollLast();

                }

                qMax.addLast(i);

            }

            Integer firstIndex = qMax.peekFirst();

            if (!qMax.isEmpty() && firstIndex < i - window + 1) {

                qMax.pollFirst();

            }

            if (i >= window - 1) {

                result[i - window + 1] = array[qMax.peek()];

            }

        }

        return result;

    }


    @Test
    public void testSlide() {

        int[] array = {4,3,5,4,3,3,6,7};

        AlgorithmUtils.arrIntPrint(slide(array, array.length, 1));

    }

}
