package com.hust.algorithm.stack.cases;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class _0006MaxTree {

    public int[] buildMaxTree(int[] array, int length) {

        int[] result = new int[length];

        Stack<Integer> assist = new Stack<>();

        Arrays.fill(result, -1);

        for (int i = 0; i < length; i++) {

            while (!assist.isEmpty() && array[assist.peek()] < array[i]) {

                if (result[assist.peek()] == -1 || array[result[assist.peek()]] > array[i]) {

                    result[assist.peek()] = i;

                }

                assist.pop();

            }

            if (!assist.isEmpty()) {

                result[i] = assist.peek();

            }

            assist.push(i);

        }

        return result;

    }


    @Test
    public void testBuildMaxTree() {

        int[] array = {3,1,4,2};

        AlgorithmUtils.arrIntPrint(buildMaxTree(array, array.length));

    }
}
