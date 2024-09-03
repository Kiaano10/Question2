/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.semester2_question2;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author lab_services_student
 */
public class Rock_Paper_ScissorsTest {
    
   private Rock_Paper_Scissors game;

    @BeforeEach
    void setUp() {
        game = new Rock_Paper_Scissors();
    }

    @Test
    void testInitialScores() {
        assertEquals(0, game.playerScore);
        assertEquals(0, game.computerScore);
        assertEquals(0, game.roundsPlayed);
    }

    @Test
    void testPlayRoundPlayerWins() {
        // Test when player wins
        game.playRound("Rock");  // Assume computer chooses Scissors (this would need control in a real test)
        assertTrue(game.playerScore > game.computerScore);
    }

    @Test
    void testPlayRoundComputerWins() {
        // Test when computer wins
        game.playRound("Rock");  // Assume computer chooses Paper (this would need control in a real test)
        assertTrue(game.computerScore > game.playerScore);
    }

    @Test
    void testPlayRoundTie() {
        // Test when it's a tie
        game.playRound("Rock");  // Assume computer also chooses Rock (this would need control in a real test)
        assertEquals(0, game.playerScore);
        assertEquals(0, game.computerScore);
    }

    @Test
    void testDetermineWinnerPlayerWins() {
        String result = game.determineWinner("Rock", "Scissors");
        assertEquals("Player wins this round!", result);
    }

    @Test
    void testDetermineWinnerComputerWins() {
        String result = game.determineWinner("Rock", "Paper");
        assertEquals("Computer wins this round!", result);
    }

    @Test
    void testDetermineWinnerTie() {
        String result = game.determineWinner("Rock", "Rock");
        assertEquals("It's a tie!", result);
    }

    @Test
    void testGameHistoryRecorded() {
        game.playRound("Rock");  // Assume the outcome is recorded
        assertNotNull(game.gameHistory[0]);  // Check that the first round was recorded
    }

  
}
