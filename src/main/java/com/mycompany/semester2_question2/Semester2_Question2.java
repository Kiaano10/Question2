/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semester2_question2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Semester2_Question2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Rock_Paper_Scissors game = new Rock_Paper_Scissors();
        game.startGame();
        
        boolean keepPlaying = true;
        while (keepPlaying) {
            System.out.print("Enter your move (Rock, Paper, Scissors): ");
            String playerMove = scanner.nextLine();
            game.playRound(playerMove);
            game.displayScore();
            keepPlaying = game.playAgain();
        }

        game.endGame();
    
    }
    //Create Rock Paper Scissors in Java in 10 Minutes- coding with john, added by coding with john. Available at https://youtu.be/DyqMglmrido?si=SY0sR7lJhtvn00Gg[Accessed 3 september 2024]
    
}
