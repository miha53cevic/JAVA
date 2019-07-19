/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_interface;

import Animal.*;

/**
 *
 * @author Mihael
 */
public class CH8_Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Dog();
        
        // Downcastam iz Animal u Dog
        ((Dog)a).Play();
        ((Dog)a).Roll();
        
        // Nema interface pet pa nema komande play i roll
        Animal b = new Lion();
        ((Lion)b).makeNoise();
    }
    
}
