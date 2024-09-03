/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semester2_question2;

/**
 *
 * @author lab_services_student
 */
public class Game {
   int playerScore;
   int computerScore;
   int roundsPlayed;

    public Game() {
        this.playerScore = 0;
        this.computerScore = 0;
        this.roundsPlayed = 0;
    }

    public void startGame() {
        System.out.println("LET THE GAMES BEGIN!!!!");
    }

    public void endGame() {
        System.out.println("Game Over!");
    }

    public void displayScore() {
        System.out.println("Score: Player " + playerScore + " - Computer " + computerScore);
    }
    // 
}
