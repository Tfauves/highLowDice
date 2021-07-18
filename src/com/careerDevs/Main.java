package com.careerDevs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Die die = new Die();
//        die.roll();
//        System.out.println(die.faceUpValue);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (s)tart: ");
        String start = scanner.next();
        if (start.equals("s")) {

            boolean activeGame = true;
            Die die1 = new Die();
            Die die2 = new Die();
            int winStreak = 0;

            while (activeGame) {
                if (winStreak %5 == 0 && winStreak > 0)
                    System.out.println("On Fire " + winStreak + " correct guesses in a row! Keep it going.");
                die1.roll();
                die2.roll();
                int total = die1.faceUpValue + die2.faceUpValue;
                System.out.println("Will the next number be (h)igher or (l)ower than " + total);
                String userGuess = scanner.next();
                //System.out.println(userGuess);
                die1.roll();
                die2.roll();
                int newTotal = die1.faceUpValue + die2.faceUpValue;
                System.out.println(newTotal);

                if ( userGuess.equals("l") && newTotal < total) {
                    System.out.println("You guessed correct! You Win!");
                    winStreak = winStreak + 1;

                } else if (userGuess.equals("l") && newTotal > total){
                    System.out.println("You Lose! Game Over!!!\n" + "Your win streak: " + winStreak);
                    activeGame = false;
                }

                if ( userGuess.equals("h") && newTotal > total) {
                    System.out.println("You guessed correct! You Win!");
                    winStreak = winStreak + 1;

                } else if (userGuess.equals("h") && newTotal < total) {
                    System.out.println("You Lose! Game Over!!!\n" + "Your win streak: " + winStreak);
                    activeGame = false;
                }

                if (newTotal == total) {
                    System.out.println("Push!!! too bad you Lose. Game Over!!!\n" + "Your win streak: " + winStreak);
                    activeGame = false;
                }
            }

        }

    }
}
