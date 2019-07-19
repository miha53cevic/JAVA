/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

/**
 *
 * @author Mihael
 */
public class Player {
    public Player(int index) {
        this.index = index;
    }
    
    public boolean Guess(int CorrectNum) {
        int Guess = (int)(Math.random() * 10);
        
        System.out.print("Player " + index + ": ");
        System.out.println("I'm guesiing number " + Guess);
        
        if (Guess == CorrectNum)
            return true;
        else return false;
    }
    
    private int index;
}
