package com.coderdream.ch10_math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Offer_66Test {

    @Test
    void constructArr() {
        Offer_66 offer_66 = new Offer_66();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] expect = new int[]{120, 60, 40, 30, 24};
        int[] result = offer_66.constructArr(nums);

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(expect[i], result[i]);
        }
    }

    @Test
    void constructArrTwo() {
        Offer_66 offer_66 = new Offer_66();
        int[] nums = new int[]{0, 1, 2, 3, 4, 5};
        int[] expect = new int[]{120, 0, 0, 0, 0, 0};
        int[] result = offer_66.constructArr(nums);

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(expect[i], result[i]);
        }
    }

    @Test
    void constructArrThree() {
        Offer_66 offer_66 = new Offer_66();
        int[] nums = new int[]{0, 0, 1, 2, 3};
        int[] expect = new int[]{0, 0, 0, 0, 0};
        int[] result = offer_66.constructArr(nums);

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(expect[i], result[i]);
        }
    }

    @Test
    void constructArrFour() {
        Offer_66 offer_66 = new Offer_66();
        int[] nums = new int[]{0, 2, 0, 4, 5};
        int[] expect = new int[]{0, 0, 0, 0, 0};
        int[] result = offer_66.constructArr(nums);

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(expect[i], result[i]);
        }
    }

    @Test
    void constructArrA() {
        Offer_66 offer_66 = new Offer_66();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] expect = new int[]{120, 60, 40, 30, 24};
        int[] result = offer_66.constructArrA(nums);

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(expect[i], result[i]);
        }
    }


    @Test
    void constructArrB() {
        Offer_66 offer_66 = new Offer_66();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] expect = new int[]{120, 60, 40, 30, 24};
        int[] result = offer_66.constructArrB(nums);

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(expect[i], result[i]);
        }
    }

}