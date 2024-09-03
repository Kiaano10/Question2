/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semester2_question2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Rock_Paper_Scissors extends Game{
    //declare arrays
      private  String[] moves = {"Rock", "Paper", "Scissors"};
     String[] gameHistory;

    public Rock_Paper_Scissors() {
        super();
        this.gameHistory = new String[100];  // Arbitrary size for demo
    }

    public void playRound(String playerMove) {
        String computerMove = moves[new Random().nextInt(moves.length)];
        System.out.println("Computer chose: " + computerMove);
        
        String result = determineWinner(playerMove, computerMove);
        System.out.println(result);

        gameHistory[roundsPlayed] = "Round " + (roundsPlayed + 1) + ": Player chose " + playerMove + ", Computer chose " + computerMove + " - " + result;
        roundsPlayed++;
    }

  public   String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "It's a tie!";
        } else if (
            (playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock"))
        ) {
            playerScore++;
            return "Player wins this round!";
        } else {
            computerScore++;
            return "Computer wins this round!";
        }
    }

    public boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to play again? (yes/no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
