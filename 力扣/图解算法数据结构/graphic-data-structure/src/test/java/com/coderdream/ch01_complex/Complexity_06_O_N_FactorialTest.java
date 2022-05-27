package com.coderdream.ch01_complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Complexity_06_O_N_FactorialTest {

    @Test
    void algorithm() {
        Complexity_06_O_N_Factorial complexity_06_o_n_factorial = new Complexity_06_O_N_Factorial();
        int N = 2;
        int result = complexity_06_o_n_factorial.algorithm(N);
        Assertions.assertEquals(2, result);

        N = 3;
        result = complexity_06_o_n_factorial.algorithm(N);
        Assertions.assertEquals(6, result);

        N = 4;
        result = complexity_06_o_n_factorial.algorithm(N);
        Assertions.assertEquals(24, result);

        N = 5;
        result = complexity_06_o_n_factorial.algorithm(N);
        Assertions.assertEquals(120, result);
    }
}