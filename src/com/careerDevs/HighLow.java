package com.careerDevs;

import java.util.Scanner;

public class HighLow {
    public Player player;
    Scanner scanner = new Scanner(System.in);
    boolean activeGame = true;
    public Die die1 = new Die();
    public Die die2 = new Die();
    int total;
    int newTotal;



    public HighLow() {
        System.out.println("Enter Player Name: ");
        player = new Player((scanner.nextLine()).trim());
        turn();

    }

    public void play() {
        while (activeGame) {
                if (player.winStreak %5 == 0 && player.winStreak > 0)
                    System.out.println("On Fire " + player.winStreak + " correct guesses in a row! Keep it going.");
                System.out.println("Will the next number be (h)igher or (l)ower than " + total);
                String userGuess = scanner.next();

                die1.roll();
                die2.roll();
                newTotal = die1.faceUpValue + die2.faceUpValue;
                System.out.println(newTotal);

//                if (newTotal == total) {
//                    System.out.println("Push!!! too bad you Lose. Game Over!!!\n" + "Your win streak: " + winStreak);
//                    break;
//                }

                if ( userGuess.equals("l") && newTotal < total) {
                    System.out.println("You guessed correct! You Win!");
                    total = newTotal;
                    player.winStreak = player.winStreak + 1;

                } else if (userGuess.equals("l")){
                    System.out.println("You Lose! Game Over!!!\n" + "Your win streak: " + player.winStreak);
                    break;
                }

                if ( userGuess.equals("h") && newTotal > total) {
                    System.out.println("You guessed correct! You Win!");
                    total = newTotal;
                    player.winStreak = player.winStreak + 1;

                } else if (userGuess.equals("h")) {
                    System.out.println("You Lose! Game Over!!!\n" + "Your win streak: " + player.winStreak);
                    break;
                }



        }
    }

    public void turn() {
        die1.roll();
        die2.roll();
        total = die1.faceUpValue + die2.faceUpValue;
        System.out.println(total);
    }



}
