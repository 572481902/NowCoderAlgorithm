package com.hust.algorithm.datastructure;

public class BinaryTree {

    public int data;
    public BinaryTree leftChild;
    public BinaryTree rightChild;

    public BinaryTree(int data) {
        this.data = data;
    }

    public BinaryTree(int data, BinaryTree leftChild, BinaryTree rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
