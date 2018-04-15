package com.hust.algorithm.string.cases;

import org.junit.Test;

/**
 * 合法括号序列判断练习题
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
 */
public class _0009ParenthesesPairing {

    public boolean pair(String bracketsStr) {

        if (bracketsStr == null || bracketsStr.length() <= 0) return false;

        int num = 0;

        for (int i = 0; i < bracketsStr.length(); i++) {

            if (num < 0) return false;

            if (bracketsStr.charAt(i) == '(') {

                ++num;

            } else if (bracketsStr.charAt(i) == ')') {

                --num;

            }

        }

        return num == 0;

    }

    @Test
    public void testPair() {

        System.out.println(pair("(asdfas)asdf(aasdfsdfasfd)(aasdf(asdf(asdf)asdf)afd)"));
        System.out.println(pair("("));

    }

}
