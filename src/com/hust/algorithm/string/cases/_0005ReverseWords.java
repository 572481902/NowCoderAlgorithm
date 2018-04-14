package com.hust.algorithm.string.cases;

import org.junit.Test;

/**
 * 句子的逆序练习题
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
 * 给定一个原字符串A和他的长度，请返回逆序后的字符串。
 * 测试样例：
 * "dog loves pig",13
 * 返回："pig loves dog"
 */
public class _0005ReverseWords {

    public String reverseSentence(String sentence) {

        char[] chars = sentence.toCharArray();

        int length = sentence.length();

        reverse(chars, 0, chars.length - 1);

        int leftIndex = -1;
        int rightIndex = -1;

        int curIndex = 0;
        while (curIndex < length) {

            if (chars[curIndex] != ' ') {

                leftIndex = curIndex == 0 || chars[curIndex - 1] == ' ' ? curIndex : leftIndex;

                rightIndex = curIndex == length - 1 || chars[curIndex + 1] == ' ' ? curIndex : rightIndex;

            }

            if (leftIndex != -1 && rightIndex != -1) {

                reverse(chars, leftIndex, rightIndex);

                leftIndex = -1;
                rightIndex = -1;

            }

            ++curIndex;

        }

        return new String(chars);

    }

    public void reverse(char[] chars, int startIndex, int endIndex) {

        if (startIndex >= endIndex) return;

        while (startIndex < endIndex) {

            char temp;

            temp = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = temp;

            ++startIndex;
            --endIndex;

        }

    }

    @Test
    public void testReverse() {

        char[] chars = new char[]{'1', '2', '3'};

        reverse(chars, 0, 0);

        System.out.println(reverseSentence("i #-*-    love you"));

    }

}
