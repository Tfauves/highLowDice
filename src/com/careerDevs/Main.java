package com.careerDevs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//            boolean activeGame = true;
//            Die die1 = new Die();
//            Die die2 = new Die();
//            int winStreak = 0;
//            die1.roll();
//            die2.roll();
//            int total = die1.faceUpValue + die2.faceUpValue;

//            while (activeGame) {
//                if (winStreak %5 == 0 && winStreak > 0)
//                    System.out.println("On Fire " + winStreak + " correct guesses in a row! Keep it going.");
//                System.out.println("Will the next number be (h)igher or (l)ower than " + total);
//                String userGuess = scanner.next();
//                //System.out.println(userGuess);
//                die1.roll();
//                die2.roll();
//                int newTotal = die1.faceUpValue + die2.faceUpValue;
//                System.out.println(newTotal);
//
//                if (newTotal == total) {
//                    System.out.println("Push!!! too bad you Lose. Game Over!!!\n" + "Your win streak: " + winStreak);
//                    break;
//                }
//
//                if ( userGuess.equals("l") && newTotal < total) {
//                    System.out.println("You guessed correct! You Win!");
//                    total = newTotal;
//                    winStreak = winStreak + 1;
//
//                } else if (userGuess.equals("l")){
//                    System.out.println("You Lose! Game Over!!!\n" + "Your win streak: " + winStreak);
//                    break;
//                }
//
//                if ( userGuess.equals("h") && newTotal > total) {
//                    System.out.println("You guessed correct! You Win!");
//                    total = newTotal;
//                    winStreak = winStreak + 1;
//
//                } else if (userGuess.equals("h")) {
//                    System.out.println("You Lose! Game Over!!!\n" + "Your win streak: " + winStreak);
//                    break;
//                }
//
//            }

    HighLow game = new HighLow();
    game.play();
//        game.die1.roll();
//        System.out.println(game.die1.faceUpValue);



    }
}
