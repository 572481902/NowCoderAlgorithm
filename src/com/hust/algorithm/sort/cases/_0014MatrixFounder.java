package com.hust.algorithm.sort.cases;

import org.junit.Test;

/**
 * 2.18 有序矩阵查找练习题
 * 现在有一个行和列都排好序的矩阵，请设计一个高效算法，快速查找矩阵中是否含有值x。
 * 给定一个int矩阵mat，同时给定矩阵大小nxm及待查找的数x，请返回一个bool值，代表矩阵中是否存在x。所有矩阵中数字及x均为int范围内整数。保证n和m均小于等于1000。
 * 测试样例：
 * [[1,2,3],[4,5,6],[7,8,9]],3,3,10
 *
 */
public class _0014MatrixFounder {

    public boolean isExitInMatrix(int[][] inputMatrix, int rowLength, int colLength, int beFoundedNum) {

        int rowCursor = 0;
        int colCursor = colLength - 1;

        while (rowCursor < rowLength && colCursor >= 0) {

            if (beFoundedNum < inputMatrix[rowCursor][colCursor]) {

                --colCursor;

            } else if (beFoundedNum > inputMatrix[rowCursor][colCursor]) {

                ++rowCursor;

            } else {

                System.out.println("row : " + rowCursor + "\t" + "col : " + colCursor);

                return true;

            }

        }

        return false;

    }


    @Test
    public void testIsExitInMatrix() {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 109}};

        System.out.println(isExitInMatrix(matrix, 3, 3, 5));

    }

}
