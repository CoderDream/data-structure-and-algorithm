package com.coderdream.ch03_dynamicprogramming;

import com.coderdream.ch01_complex.Complexity_05_O_2_N;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Offer_63_StockMaxProfitTest {

    @Test
    void maxProfit() {
        Offer_63_StockMaxProfit offer_63_stockMaxProfit = new Offer_63_StockMaxProfit();
        int[] prices = {7,1,5,3,6,4};
        int expect = 5;
        int result = offer_63_stockMaxProfit.maxProfit(prices);
        Assertions.assertEquals(expect, result);
        int[] prices2 = {7,6,4,3,1};
        expect = 0;
        result = offer_63_stockMaxProfit.maxProfit(prices2);
        Assertions.assertEquals(expect, result);
    }
}