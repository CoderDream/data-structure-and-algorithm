package com.coderdream.ch03_dynamicprogramming;

/**
 * 剑指 Offer 63. 股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * <p>
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *  
 * 限制：
 * 0 <= 数组长度 <= 10^5
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/58nn7r/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer_63_StockMaxProfit {

    public int maxProfit(int[] prices) {
        // 如果输入数组为空，直接返回最大利润为0
        if (prices.length == 0) {
            return 0;
        }
        // 设置默认结果为0
        int result = 0;
        // 最低价格为第一个元素
        int minPrice = prices[0];
        // 从第二个元素开始循环遍历
        for (int i = 1; i < prices.length; i++) {
            // 最新结果为历史结果与当前价格减去最低价格两者的最大值
            result = Math.max(result, prices[i] - minPrice);
            // 更新最低价格，最低价格为历史最低价格与当前价格两者的最小值
            minPrice = Math.min(minPrice, prices[i]);
        }
        // 返回最终结果
        return result;
    }

    public int maxProfitVersionB(int[] prices) {
        // 设置默认结果为0
        int profit = 0;
        // 初始化花费为最大整数
        int cost = Integer.MAX_VALUE;
        // 遍历所有股票价格
        for (int price : prices) {
            // 找到最低成本价格
            cost = Math.min(cost, price);
            // 找到最大获利，历史获利与当前价格与最低成本价格之差
            profit = Math.max(profit, price - cost);
        }

        // 返回最大获利
        return profit;
    }
}

