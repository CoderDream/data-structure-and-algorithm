package com.coderdream.ch01_complex;

/**
 * 指数 O(2^N) ：
 * 生物学科中的 “细胞分裂” 即是指数级增长。初始状态为 1 个细胞，分裂一轮后为 2 个，分裂两轮后为 4 个，……，分裂 NN 轮后有 2^N个细胞。
 * <p>
 * 算法中，指数阶常出现于递归，算法原理图与代码如下所示。
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/r81qpe/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Complexity_05_O_2_N {
    /**
     * 指数 O(2^N) ：
     * 生物学科中的 “细胞分裂” 即是指数级增长。初始状态为 1 个细胞，分裂一轮后为 2 个，分裂两轮后为 4 个，……，分裂 NN 轮后有 2^N个细胞。
     *
     * @param N
     * @return
     */
    public int algorithm(int N) {
        if (N <= 0) {
            return 1;
        }
        int count_1 = algorithm(N - 1);
        int count_2 = algorithm(N - 1);
        return count_1 + count_2;
    }

}
