package com.careerDevs;

import java.util.Random;

public class Die {
    public int numberOfSides;
    public int faceUpValue;

    public Die() {
        numberOfSides = 6;
    }

    public Die (int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void roll() {
        Random diceValue = new Random();
        int maxSideValue = 6;
        int minSideValue = 1;
        faceUpValue = diceValue.nextInt(maxSideValue) + minSideValue;
    }
}
