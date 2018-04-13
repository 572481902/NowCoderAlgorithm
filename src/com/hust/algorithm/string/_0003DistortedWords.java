package com.hust.algorithm.string;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
 * 给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
 */
public class _0003DistortedWords {

    public boolean isDistortedWordsOpt(String words1Str, String words2Str) {

        if (words1Str.length() != words2Str.length() || words1Str.length() < 1) {

            return false;

        }

        char[] words1 = words1Str.toCharArray();
        char[] words2 = words2Str.toCharArray();

        int length = words1Str.length();

        int[] map = new int[255];

        for (int i = 0; i < length; i++) {

            map[words1[i]]++;

        }

        for (int i = 0; i < length; i++) {

            if (--map[words2[i]] < 0) {

                return false;

            }

        }

        return true;
    }

    public boolean isDistortedWords(String words1, String words2) {

        if (words1.length() != words2.length()) return false;

        HashMap<Character, Integer> words1Map = new HashMap<>();
        HashMap<Character, Integer> words2Map = new HashMap<>();

        int length = words1.length();

        for (int i = 0; i < length; ++i) {

            char key1 = words1.charAt(i);
            char key2 = words2.charAt(i);

            Integer integer1 = words1Map.get(key1);
            Integer integer2 = words2Map.get(key2);

            if (integer1 == null) {

                words1Map.put(key1, 1);

            } else {

                words1Map.put(key1, words1Map.get(key1) + 1);

            }

            if (integer2 == null) {

                words2Map.put(key2, 1);

            } else {

                words2Map.put(key2, words2Map.get(key2) + 1);

            }
        }

        if (words1Map.size() != words2Map.size()) {

            return false;

        }

        for (Map.Entry entry : words1Map.entrySet()) {

            Character key = (Character)entry.getKey();
            Integer value = (Integer)entry.getValue();

            if (words2Map.get(key) == null || words2Map.get(key).intValue() != value.intValue()) {

                return false;

            }

        }

        return true;
    }


    @Test
    public void testIsDistortedWords() {

        System.out.println(isDistortedWords(";lkjhgfdsa", "asdfghjkl;"));
        System.out.println(isDistortedWordsOpt(";lkhgfdsa", "asdfghjkl;"));

    }
}
