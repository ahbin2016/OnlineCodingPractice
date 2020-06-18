package com.test.future.skill;

public class BuyAndSellGoldAPI {

    private int[] prices;

    public BuyAndSellGoldAPI (int[] prices) {
        this.prices = prices;
    }

    public int getNumDays() {
        return prices.length;
    }

    public int getPriceOnDay(int day) {

        return prices[day];
    }

}
