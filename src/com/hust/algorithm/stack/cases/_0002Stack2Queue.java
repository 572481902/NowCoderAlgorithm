package com.hust.algorithm.stack.cases;

import org.junit.Test;

import java.util.Stack;

public class _0002Stack2Queue {

    private Stack<Integer> stackPush = new Stack<>();
    private Stack<Integer> stackPop  = new Stack<>();

    private Integer push(Integer data) {

        return stackPush.push(data);

    }

    public Integer pop() {

        if (stackPop.isEmpty()) {

            while (!stackPush.isEmpty()) {

                stackPop.push(stackPush.pop());

            }

            return stackPop.pop();

        }

        return stackPop.pop();

    }


    @Test
    public void testStack2Queue() {

        _0002Stack2Queue stack2Queue = new _0002Stack2Queue();

        stack2Queue.push(1);
        stack2Queue.push(2);
        stack2Queue.push(3);
        System.out.println(stack2Queue.pop());
        System.out.println(stack2Queue.pop());
        System.out.println(stack2Queue.pop());
        stack2Queue.push(4);
        stack2Queue.push(5);
        stack2Queue.push(6);
        stack2Queue.push(7);
        System.out.println(stack2Queue.pop());
        System.out.println(stack2Queue.pop());


    }
}
