package com.hust.algorithm.binarysearch.cases;

import org.junit.Test;

public class _0001LocalMinimum  {

    public int minimumNum(int[] nums, int leftIndex, int rightIndex) {

        if (leftIndex > rightIndex || nums == null || nums.length == 0 || rightIndex > nums.length - 1 || leftIndex < 0) return -1;

        if (nums.length == 1 || leftIndex == rightIndex) return nums[leftIndex];

        if (nums[leftIndex] < nums[leftIndex + 1]) return nums[leftIndex];
        if (nums[rightIndex] < nums[rightIndex - 1]) return nums[rightIndex];

        int mid = leftIndex + (rightIndex - leftIndex) / 2;

        if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) return nums[mid];

        if (nums[mid] > nums[mid - 1]) return minimumNum(nums, leftIndex, mid);

        if (nums[mid] > nums[mid + 1]) return minimumNum(nums, mid, rightIndex);

        return -1;

    }


    @Test
    public void testMinimumNum() {

        int[] array00 = {100, 1, 2, 3, 4, 5, 6, 7, 8, 100};
        int[] array01 = {1, 2};
        int[] array02 = {30, 20, 100, 40, 50};

        System.out.println(minimumNum(array00, 0, array00.length - 1));
        System.out.println(minimumNum(array01, 0, array01.length - 1));
        System.out.println(minimumNum(array02, 0, array02.length - 1));

    }
}
