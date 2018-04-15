package com.hust.algorithm.string.cases;

import org.junit.Test;

/**
 * 空格替换练习题
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
 * 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string
 */
public class _0008SpaceReplace {

    public String replace(String str) {

        char[] chars = str.toCharArray();

        int spaceCount = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == ' ') {

                ++spaceCount;

            }

        }

        char[] resChars = new char[chars.length + spaceCount * 2];

        for (int i = chars.length - 1; i >= 0; i--) {

            if (chars[i] != ' ') {

                resChars[i + spaceCount * 2] = chars[i];

            } else {

                resChars[i + spaceCount * 2] = '0';
                resChars[i + spaceCount * 2 - 1] = '2';
                resChars[i + spaceCount * 2 - 2] = '%';

                --spaceCount;

            }

        }

        return new String(resChars);

    }


    @Test
    public void testReplace() {

        String str00 = "I Love You Forever !";
        String str01 = " Forever Love, Forever Love ";

        System.out.println(replace(str00));
        System.out.println(replace(str01));

    }
}
