package com.kodilla.patterns.strategy;

public class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggresive predictor] Buy stock of XYZ";
    }
}
