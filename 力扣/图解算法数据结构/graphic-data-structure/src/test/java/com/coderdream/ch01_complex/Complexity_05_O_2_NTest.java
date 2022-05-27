package com.coderdream.ch01_complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Complexity_05_O_2_NTest {

    @Test
    void algorithm() {
        Complexity_05_O_2_N complexity_05_o_2_n = new Complexity_05_O_2_N();
        int N = 10;
        int result = complexity_05_o_2_n.algorithm(N);
        Assertions.assertEquals(1024, result);
    }
}