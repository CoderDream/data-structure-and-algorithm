package com.coderdream.ch01_complex;

/**
 * 平方 O(N^2)：
 * 两层循环相互独立，都与 NN 呈线性关系，因此总体与 NN 呈平方关系，时间复杂度为 O(N^2) 。
 *
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/r81qpe/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Complexity_04_O_N_N {
    /**
     * 平方 O(N^2)：
     * 两层循环相互独立，都与 NN 呈线性关系，因此总体与 NN 呈平方关系，时间复杂度为 O(N^2) 。
     *
     * @param N
     * @return
     */
    public int returnCountCaseTwo(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count++;
            }
        }
        return count;
    }

    /**
     * 以「冒泡排序」为例，其包含两层独立循环：
     *
     * 第一层复杂度为 O(N) ；
     * 第二层平均循环次数为 N/2 ，复杂度为 O(N) ，推导过程如下：
     * O(N/2) = O(1/2)O(N) = O(1)O(N) = O(N)
     * 因此，冒泡排序的总体时间复杂度为 O(N^2) ，代码如下所示。
     *
     * 作者：Krahets
     * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/r81qpe/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param nums
     * @return
     */
    public int[] bubbleSort(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        return nums;
    }
}
