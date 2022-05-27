package com.coderdream.ch01_complex;

/**
 * 线性对数 O(NlogN) ：
 * 两层循环相互独立，第一层和第二层时间复杂度分别为 O(logN) 和 O(N) ，则总体时间复杂度为 O(NlogN) ；
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/r81qpe/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Complexity_08_O_N_log_N {
    /**
     * @param N
     * @return
     */
    public int algorithm(int N) {
        int count = 0;
        float i = N;
        while (i > 1) {
            i = i / 2;
            for (int j = 0; j < N; j++) {
                count++;
            }
        }
        return count;
    }
}