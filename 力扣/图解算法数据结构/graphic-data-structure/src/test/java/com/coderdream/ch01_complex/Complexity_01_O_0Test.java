package com.coderdream.ch01_complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [Junit5集成到Maven工程](https://www.jianshu.com/p/7eec30037376)
 * [IDEA自动生成测试类以及测试方法](https://blog.csdn.net/qq_45451805/article/details/105799537)
 * [JAVA中数组的初始化](https://blog.csdn.net/chen404897439/article/details/90715248)
 */
class Complexity_01_O_0Test {

    @Test
    void findSeven() {
        Complexity_01_O_0 complexity_01_o_0 = new Complexity_01_O_0();
        int[] nums = new int[]{7, 4, 5, 3, 0};
        // int[] nums = new int[]{10, 20, 30};//静态数组标准分配
        boolean result = complexity_01_o_0.findSeven(nums);

        Assertions.assertEquals(true, result);
    }
}