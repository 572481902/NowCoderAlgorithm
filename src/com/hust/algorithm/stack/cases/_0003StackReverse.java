package com.hust.algorithm.stack.cases;

import org.junit.Test;

import java.util.Stack;

public class _0003StackReverse {

    public void reverseStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {

            return;

        }

        Integer bottomData = getStackBottom(stack);

        reverseStack(stack);

        stack.push(bottomData);

    }

    public Integer getStackBottom(Stack<Integer> stack) {

        Integer topData = stack.pop();

        if (stack.isEmpty()) {

            return topData;

        } else {

            Integer lastData = getStackBottom(stack);

            stack.push(topData);

            return lastData;

        }

    }

    @Test
    public void testReverseStack() {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(0);

        reverseStack(stack);

        while (!stack.isEmpty()) {

            System.out.println(stack.pop());

        }

    }
}
