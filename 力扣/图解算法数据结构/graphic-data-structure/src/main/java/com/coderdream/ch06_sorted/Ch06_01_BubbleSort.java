package com.coderdream.ch06_sorted;

public class Ch06_01_BubbleSort {
    public void bubbleSort(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N -1; i++) { // 外循环
            for (int j = 0; j < N -i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    // 交换 num[j] 和 num[j+1]
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }

    public void bubbleSortV2(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            boolean flag = false; // 初始化标志位
            for (int j = 0; j < N - i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true; // 记录交换元素
                }
            }
            if(!flag) {
                break; // 内循环未交换任何元素，则跳出
            }
        }
    }
}
