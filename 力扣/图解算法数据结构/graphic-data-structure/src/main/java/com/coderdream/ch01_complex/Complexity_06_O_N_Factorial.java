package com.coderdream.ch01_complex;

/**
 * 阶乘 O(N!) ：
 * 阶乘阶对应数学上常见的 “全排列” 。即给定 NN 个互不重复的元素，求其所有可能的排列方案，则方案数量为：
 *
 * N * (N - 1) * (N - 2) * ... * 2 * 1 = N!
 * N×(N−1)×(N−2)×⋯×2×1=N!
 *
 * 如下图与代码所示，阶乘常使用递归实现，算法原理：第一层分裂出 N 个，第二层分裂出 N - 1 个，…，直至到第 NN 层时终止并回溯。
 *
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/r81qpe/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Complexity_06_O_N_Factorial {
    /**
     * @param N
     * @return
     */
    public int algorithm(int N) {
        if (N <= 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            count += algorithm(N - 1);
        }
        return count;
    }

}
