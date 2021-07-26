package com.careerDevs;

public class Player {
    public Die dice;
    public String name;
    public int score = 0;
    public int winStreak = 0;

    public Player(String name) {
        this.name = name;
    }

    public int updateScore() {
        int roundTotal = 0;
        roundTotal += dice.faceUpValue;
        score += roundTotal;
        return roundTotal;
    }



}
