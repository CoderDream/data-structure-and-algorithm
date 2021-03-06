package com.coderdream.ch01_complex;

public class Complexity_01_O_0 {
    /**
     * 题目： 输入长度为 NN 的整数数组 nums ，判断此数组中是否有数字 77 ，若有则返回 true ，否则返回 falsefalse 。
     *
     * 解题算法： 线性查找，即遍历整个数组，遇到 77 则返回 true 。
     * 最佳情况 \Omega(1)Ω(1) ： nums = [7, a, b, c, ...] ，即当数组首个数字为 77 时，无论 nums 有多少元素，线性查找的循环次数都为 11 次；
     * 最差情况 O(N)O(N) ： nums = [a, b, c, ...] 且 nums 中所有数字都不为 77 ，此时线性查找会遍历整个数组，循环 NN 次；
     * 平均情况 \ThetaΘ ： 需要考虑输入数据的分布情况，计算所有数据情况下的平均时间复杂度；例如本题目，需要考虑数组长度、数组元素的取值范围等；
     * 大 OO 是最常使用的时间复杂度评价渐进符号，下文示例与本 LeetBook 题目解析皆使用 OO 。
     *
     * @param nums
     * @return
     */
    public boolean findSeven(int[] nums) {
        for (int num: nums) {
            if(num == 7) {
                return true;
            }
        }
        return false;
    }
}
