/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guessing_Game;
import Player.Player;

/**
 *
 * @author Mihael
 */
public class GuessingGame {
    public void Start() {
        boolean isRunning = true;
        
        Player p1 = new Player(1);
        Player p2 = new Player(2);
        Player p3 = new Player(3);
        
        int RandomNum = (int)(Math.random() * 10);
        
        System.out.println("Correct Number is " + RandomNum);
        
        while (isRunning) {
            if (p1.Guess(RandomNum)) {
                isRunning = false;
            }
            else if (p2.Guess(RandomNum)) {
                isRunning = false;
            }
            else if (p3.Guess(RandomNum)) {
                isRunning = false;
            }
        }
    }
}
