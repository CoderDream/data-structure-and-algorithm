package com.coderdream.ch06_sorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch06_01_BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] nums = {4, 1, 3, 1, 5, 2};
        Ch06_01_BubbleSort ch0601BubbleSort= new Ch06_01_BubbleSort();
        ch0601BubbleSort.bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    @Test
    void bubbleSortV2() {
        int[] nums = {4, 1, 3, 1, 5, 2};
        Ch06_01_BubbleSort ch0601BubbleSort= new Ch06_01_BubbleSort();
        ch0601BubbleSort.bubbleSortV2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}