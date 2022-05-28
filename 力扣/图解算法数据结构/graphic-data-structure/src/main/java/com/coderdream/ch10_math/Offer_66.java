package com.coderdream.ch10_math;

/**
 * 剑指 Offer 66. 构建乘积数组
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 * <p>
 * 提示：
 * 所有元素乘积之和不会溢出 32 位整数
 * a.length <= 100000
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/57d8cm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * <p>
 * https://www.bilibili.com/video/BV18D4y1D7JP
 */
public class Offer_66 {

    public int[] constructArrA(int[] nums) {
        // 数组长度
        int N = nums.length;
        // 左边元素连乘数组
        int[] leftOutput = new int[N];
        // 右边元素连乘数组
        int[] rightOutput = new int[N];
        // 左边数组的第一个元素置为1；
        leftOutput[0] = 1;
        // 右边数组的最后一个元素置为1；
        rightOutput[N - 1] = 1;
        // 设置左边数组，从第二个元素开始相乘
        for (int i = 1; i < N; i++) {
            // 所在元素等于前一个元素乘原始数组的前一个元素
            leftOutput[i] = leftOutput[i - 1] * nums[i - 1];
        }
        // 设置右边数组，从倒数第二个元素开始相乘
        for (int i = N - 2; i >= 0; i--) {
            // 所在元素等于后一个元素乘原始数组的后一个元素
            rightOutput[i] = rightOutput[i + 1] * nums[i + 1];
        }

        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = leftOutput[i] * rightOutput[i];
        }
        return b;
    }

    public int[] constructArrB(int[] a) {
        // 数组长度
        int N = a.length;
        if (N == 0) {
            return new int[0];
        }
        // 输出数组
        int[] output = new int[N];
        // 输出数组的第一个元素置为1；
        output[0] = 1;
        // 设置左边数组为输出数组，从第二个元素开始相乘
        for (int i = 1; i < N; i++) {
            // 所在元素等于前一个元素乘原始数组的前一个元素
            output[i] = output[i - 1] * a[i - 1];
        }
        // 右边数组的最后一个元素置为1；
        int rightOutput = 1;
        // 设置右边数组，从倒数第二个元素开始相乘
        for (int i = N - 1; i >= 0; i--) {
            // 设置输出数组对应位置的值，为左边乘积对应位置的值*右边上次计算后的值
            output[i] = output[i] * rightOutput;
            // 所在元素等于后一个元素乘原始数组的当前元素
            rightOutput = rightOutput * a[i];
        }

        return output;
    }


    public int[] constructArr(int[] a) {
        int len = a.length;
        if (len == 0) {
            return new int[0];
        }
        int[] b = new int[len];
        b[0] = 1;
        for (int i = 1; i < len; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        int tmp = 1;
        for (int i = len - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }

        return b;
    }
}
