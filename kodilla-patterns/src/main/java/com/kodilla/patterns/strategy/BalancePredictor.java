package com.kodilla.patterns.strategy;

public class BalancePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared of XYZ";
    }
}
