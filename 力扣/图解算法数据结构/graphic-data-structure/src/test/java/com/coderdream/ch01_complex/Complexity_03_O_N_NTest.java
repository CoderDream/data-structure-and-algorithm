package com.coderdream.ch01_complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Complexity_03_O_N_NTest {

    @Test
    void bubbleSort() {
        Complexity_04_O_N_N complexity_04_O_N_N = new Complexity_04_O_N_N();
        int[] nums = new int[]{7, 4, 5, 3, 0};
        int[] expect = new int[]{0, 3, 4, 5, 7};
        int[] result = complexity_04_O_N_N.bubbleSort(nums);

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(expect[i], result[i]);
        }
    }
}