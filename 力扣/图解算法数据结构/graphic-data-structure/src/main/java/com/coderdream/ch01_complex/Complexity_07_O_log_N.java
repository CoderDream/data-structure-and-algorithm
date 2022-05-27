package com.coderdream.ch01_complex;

/**
 * 对数 O(logN) ：
 * 对数阶与指数阶相反，指数阶为 “每轮分裂出两倍的情况” ，而对数阶是 “每轮排除一半的情况” 。对数阶常出现于「二分法」、「分治」等算法中，体现着 “一分为二” 或 “一分为多” 的算法思想。
 * <p>
 * 设循环次数为 m ，则输入数据大小 N 与 2 ^ m 呈线性关系，两边同时取 log_2 对数，则得到循环次数 m 与 log2N 呈线性关系，即时间复杂度为 O(logN) 。
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/r81qpe/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Complexity_07_O_log_N {
    /**
     * @param N
     * @return
     */
    public int algorithm(int N) {
        int count = 0;
        float i = N;
        while (i > 1) {
            i = i / 2;
            count++;
        }
        return count;
    }

    /**
     * @param N
     * @return
     */
    public int algorithmTwo(int N) {
        int count = 0;
        float i = N;
        int a = 3;
        while (i > 1) {
            i = i / a;
            count++;
        }
        return count;
    }

}
