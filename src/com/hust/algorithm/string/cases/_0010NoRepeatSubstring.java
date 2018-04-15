package com.hust.algorithm.string.cases;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _0010NoRepeatSubstring {

    public int longestSubstr(String str) {

        if(str == null || str.length() <= 0) return 0;

        char[] chars = str.toCharArray();

        Map<Character, Integer> char_lastIndex = new HashMap<>();
        int[] preRepeat = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            Integer lastIndex = char_lastIndex.get(chars[i]);

            if (lastIndex == null) {

                char_lastIndex.put(chars[i], i);

                preRepeat[i] = (i == 0 ? 1 : preRepeat[i - 1] + 1);

            } else {

                int preRepeatCount = preRepeat[i - 1];
                int charLastIndex = lastIndex + 1;

                int preRepeatIndex = i - preRepeatCount;

                if (charLastIndex > preRepeatIndex) {

                    preRepeat[i] = i - charLastIndex + 1;

                } else {

                    preRepeat[i] = i - preRepeatIndex + 1;

                }

                char_lastIndex.put(chars[i], i);

            }

        }


        Arrays.sort(preRepeat);
        return preRepeat[preRepeat.length - 1];

    }

    @Test
    public void testLongestSubstr() {

        System.out.println(longestSubstr("pwasdfafsadawkew"));

    }

}

/*
int longestSize = 0;
		int repIndex = 0;

		List<Character> charList = new ArrayList<Character>();
		List<Character> storeList = new ArrayList<Character>();

		int k = 0;
		for(int i = 0; i < s.length(); i++) {


			if (charList.contains(s.charAt(i))) {

				repIndex = storeList.lastIndexOf(s.charAt(i));
				i = repIndex;

				if (longestSize < charList.size()) {

					longestSize = charList.size();

				}

				charList.clear();

			} else {

				charList.add(s.charAt(i));

				if (k == i) {

					storeList.add(s.charAt(i));
					++k;
				}

			}

		}

		if (longestSize < charList.size()) {

			longestSize = charList.size();

		}

		return longestSize;
 */
