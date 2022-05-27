package com.coderdream.ch01_complex;

public class Complexity_03_O_N {
    /**
     * 线性 O(N) ：
     * 循环运行次数与 N 大小呈线性关系，时间复杂度为 O(N) 。
     *
     * @param N
     * @return
     */
    public int returnCount(int N) {
        int count = 0;
        int a = 10000;
        for (int i = 0; i < N; i++) {
            count++;
        }
        return count;
    }

    /**
     * 线性 O(N) ：
     * 循环运行次数与 N 大小呈线性关系，时间复杂度为 O(N) 。
     *
     * @param N
     * @return
     */
    public int returnCountCaseTwo(int N) {
        int count = 0;
        int a = 10000;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < a; j++) {
                count++;
            }
        }
        return count;
    }
}
