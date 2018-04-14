package com.hust.algorithm.string.cases;

import com.hust.algorithm.string._0001KmpAlgorithm;
import org.junit.Test;

/**
 * 两串旋转练习题
 * 如果对于一个字符串A，将A的前面任意一部分挪到后边去形成的字符串称为A的旋转词。比如A="12345",A的旋转词有"12345","23451","34512","45123"和"51234"。对于两个字符串A和B，请判断A和B是否互为旋转词。
 * 给定两个字符串A和B及他们的长度lena，lenb，请返回一个bool值，代表他们是否互为旋转词。
 */
public class _0004RotateWords {

    /**
     * 判断str2是否是str1的旋转词
     * @param str1
     * @param str2
     * @return
     */
    public boolean isRotateWords(String str1, String str2) {

        if (str1.length() != str2.length()) {

            return false;

        }

        String tempStr = str1 + str1;

        _0001KmpAlgorithm kmpAlgorithm = new _0001KmpAlgorithm();

        return kmpAlgorithm.isMatch(tempStr, str2);

    }

    @Test
    public void testIsRotateWords() {

        System.out.println(isRotateWords("12345", "12445"));
        System.out.println(isRotateWords("12345", "23451"));
        System.out.println(isRotateWords("12345", "34512"));
        System.out.println(isRotateWords("12345", "45123"));
        System.out.println(isRotateWords("12345", "51234"));

    }

}
