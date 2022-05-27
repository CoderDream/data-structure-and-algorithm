package com.coderdream.ch01_complex;

public class Complexity_02_O_1 {
    /**
     * 运行次数与 N 大小呈常数关系，即不随输入数据大小 N 的变化而变化。
     *
     * @param N
     * @return
     */
    public int returnOne(int N) {
        int a = 1;
        int b = 2;
        int x = a * b + N;
        return 1;
    }

    /**
     *对于以下代码，无论 a 取多大，都与输入数据大小 N 无关，因此时间复杂度仍为 O(1) 。
     *
     * @param N
     * @return
     */
    public int returnCount(int N) {
        int count = 0;
        int a = 10000;
        for (int i = 0; i < a; i++) {
            count++;
        }
        return count;
    }
}
