package com.hust.algorithm.stack.cases;

import org.junit.Test;

import java.util.Stack;

public class _0004StackSort {

    public void sortStack(Stack<Integer> stack) {

        if (stack == null || stack.isEmpty()) return;

        Stack<Integer> assistStack = new Stack<>();

        while (!stack.isEmpty()) {

            Integer topData = stack.pop();

            if (assistStack.isEmpty() || assistStack.peek() >= topData) {

                assistStack.push(topData);

            } else {

                while (!assistStack.isEmpty()) {

                    stack.push(assistStack.pop());

                }

                assistStack.push(topData);
            }

        }

        while (!assistStack.isEmpty()) {

            stack.push(assistStack.pop());

        }
    }

    @Test
    public void testSortStack() {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(3);
        stack.push(9);
        stack.push(0);

        sortStack(stack);

        while (!stack.isEmpty()) {

            System.out.println(stack.pop());

        }

    }

}
