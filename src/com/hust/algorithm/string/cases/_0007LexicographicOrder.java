package com.hust.algorithm.string.cases;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 拼接最小字典序练习题
 * 对于一个给定的字符串数组，请找到一种拼接顺序，使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
 * 给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
 */
public class _0007LexicographicOrder {

    public String findSmallestOrder(String[] words) {

        Arrays.sort(words, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                String o1_o2 = o1 + o2;
                String o2_o1 = o2 + o1;

                return o1_o2.compareTo(o2_o1);
            }
        });

        StringBuilder result = new StringBuilder();
        for (String word : words) {

            result.append(word);

        }

        return result.toString();
    }

    @Test
    public void testFindSmallestOrder() {

        System.out.println(findSmallestOrder(new String[]{"abc","de"}));

    }

}
