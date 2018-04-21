package com.hust.algorithm.binarysearch.cases;

import org.junit.Test;

public class _0006QuickPower {

    public int getPower(int k, int N) {

        if (N == 0) return 1;

        if (k == 1) return k;

        if (N % 2 == 0) {

            int tempRes = getPower(k, N / 2);

            return tempRes * tempRes;

        } else {

            int tempRes = getPower(k, N / 2);

            return tempRes * tempRes * k;

        }


    }


    @Test
    public void testGetPower() {

        int k = 4;
        int N = 5;

        System.out.println(getPower(k, N));

    }
}
