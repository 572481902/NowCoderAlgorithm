package com.hust.algorithm.string.cases;

import org.junit.Test;

public class _0006StringShift {

    public String shiftByIndex(String target, int index) {

        _0005ReverseWords reverseWords = new _0005ReverseWords();

        char[] chars = target.toCharArray();

        int startIndex = 0;
        int endIndex = target.length() - 1;

        reverseWords.reverse(chars, startIndex, index);
        reverseWords.reverse(chars, index + 1, endIndex);
        reverseWords.reverse(chars, startIndex, endIndex);

        return new String(chars);
    }


    @Test
    public void testShiftByIndex() {

        System.out.println(shiftByIndex("1234567890", 4));

    }
}
