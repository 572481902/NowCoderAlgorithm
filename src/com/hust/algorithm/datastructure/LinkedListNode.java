package com.hust.algorithm.datastructure;

public class LinkedListNode<T> {

    public T data;
    public LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public LinkedListNode(T data, LinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public LinkedListNode() {
    }
}
