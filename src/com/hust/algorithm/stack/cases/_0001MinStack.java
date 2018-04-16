package com.hust.algorithm.stack.cases;

import org.junit.Test;

import java.util.Stack;

public class _0001MinStack {

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public Integer pop() {

        if (!dataStack.empty()) {

            Integer currentData = dataStack.pop();

            if (currentData <= minStack.peek()) {

                minStack.pop();

            }

            return currentData;

        } else {

            return -1;

        }

    }

    public Integer push(int data) {

        if (minStack.empty()) {

            minStack.push(data);

        } else {

            Integer currentMin = minStack.peek();

            if (currentMin == null || data <= currentMin) {

                minStack.push(data);

            }

        }
        return dataStack.push(data);

    }

    public Integer getMinData() {

        if (!minStack.empty()) {

            return minStack.peek();

        } else {

            return -1;

        }


    }

    public Integer peek() {

        return dataStack.peek();

    }

    @Test
    public void testStackOperate() {

        _0001MinStack minStack = new _0001MinStack();

        minStack.push(5);
        minStack.push(4);
        minStack.push(1);
        minStack.push(3);
        minStack.push(7);
        minStack.push(0);

        System.out.println(minStack.pop());
        System.out.println(minStack.getMinData());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMinData());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMinData());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMinData());
    }

}
