package com.hust.algorithm.string;

import com.hust.algorithm.utils.AlgorithmUtils;
import org.junit.Test;

public class _0001KmpAlgorithm {

    public int[] getNextArray(String pattern) {

        int repeatLength = 0;   //前后缀重复串长度

        int patternStrLength = pattern.length();

        int[] next = new int[patternStrLength];

        next[0] = 0;

        for (int i = 1; i < patternStrLength; ++i) {

            while (repeatLength > 0 && pattern.charAt(repeatLength) != pattern.charAt(i)) {

                repeatLength = next[repeatLength];

            }

            if (pattern.charAt(repeatLength) == pattern.charAt(i)) {

                ++repeatLength;

            }

            next[i] = repeatLength;

        }

        return next;

    }

    public boolean isMatch(String target, String pattern) {

        int targetStrLength = target.length();
        int patternStrLength = pattern.length();

        int iTarget = 0;
        int jPattern = 0;

        int[] next = getNextArray(pattern);

        while (iTarget < targetStrLength && jPattern < patternStrLength) {

            if (target.charAt(iTarget) == pattern.charAt(jPattern)) {

                ++iTarget;
                ++jPattern;

            } else if (jPattern == 0) {

                ++iTarget;

            } else {

                jPattern = next[jPattern];

            }

        }

        return jPattern == patternStrLength;

    }


    @Test
    public void testIsMatch() {

        AlgorithmUtils.arrIntPrint(getNextArray("acbaax"));
        System.out.println(isMatch("aaaabcde", "abce"));

    }

}
