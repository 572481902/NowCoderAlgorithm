package com.hust.algorithm.string;

import org.junit.Test;

/**
 * 对于两棵彼此独立的二叉树A和B，请编写一个高效算法，检查A中是否存在一棵子树与B树的拓扑结构完全相同。
 * 给定两棵二叉树的头结点A和B，请返回一个bool值，代表A中是否存在一棵同构于B的子树。
 */
public class _0002TopologyTree {

    class TreeNode {

        private char node;

        private TreeNode leftChild = null;
        private TreeNode rightChild = null;

        public TreeNode(char node) {
            this.node = node;
        }

        public char getNode() {
            return node;
        }

        public void setNode(char node) {
            this.node = node;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }
    }

    public boolean subTreeMatch(TreeNode targetTree, TreeNode patternTree) {

        String targeTreeStr = serializeTreeByPre(targetTree);
        String patternTreeStr = serializeTreeByPre(patternTree);

        _0001KmpAlgorithm kmpAlgorithm = new _0001KmpAlgorithm();

        return kmpAlgorithm.isMatch(targeTreeStr, patternTreeStr);

    }

    public String serializeTreeByPre(TreeNode tree) {

        StringBuilder sb = new StringBuilder();

        if (tree == null) {

            return "*";

        }

        sb.append(tree.getNode() + "!");

        sb.append(serializeTreeByPre(tree.getLeftChild()));
        sb.append(serializeTreeByPre(tree.getRightChild()));

        return sb.toString();

    }

    @Test
    public void testSerializeTreeByPre() {

        TreeNode treeNode00 = new TreeNode('0');
        TreeNode treeNode01 = new TreeNode('1');
        TreeNode treeNode02 = new TreeNode('2');
        TreeNode treeNode03 = new TreeNode('3');
        TreeNode treeNode04 = new TreeNode('4');
        TreeNode treeNode05 = new TreeNode('5');
        TreeNode treeNode06 = new TreeNode('6');

        treeNode00.leftChild = treeNode01;
        treeNode00.rightChild = treeNode02;
        treeNode01.leftChild = treeNode03;
        treeNode01.rightChild = treeNode04;
        treeNode02.leftChild = treeNode05;
        treeNode02.rightChild = treeNode06;

        System.out.println(serializeTreeByPre(treeNode00));
        System.out.println(serializeTreeByPre(treeNode02));

        System.out.println(subTreeMatch(treeNode00, treeNode02));

    }

}
