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

            while (activeGame) {
            die1.roll();
            die2.roll();
            int total = die1.faceUpValue + die2.faceUpValue;
            //System.out.println(total);
                System.out.println("Will the next number be (h)igher or (l)ower than " + total);
                String userGuess = scanner.next();
                //System.out.println(userGuess);
                die1.roll();
                die2.roll();
                int newTotal = die1.faceUpValue + die2.faceUpValue;
                System.out.println(newTotal);
                if ( userGuess.equals("l") && newTotal < total) {

                    System.out.println("You Win!");
                } else {
                    System.out.println("You Lose");
                    activeGame = false;
                }

                if ( userGuess.equals("h") && newTotal > total) {

                    System.out.println("You Win!");
                } else {
                    System.out.println("You Lose!");
                    activeGame = false;
                }
            }

//            if (total < 5) {
//
//                activeGame = false;
//            } else {
//                activeGame = true;
//
//            }




        }

    }
}
