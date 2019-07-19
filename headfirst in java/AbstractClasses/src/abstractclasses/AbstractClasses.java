/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

import animal.*;

/**
 *
 * @author Mihael
 */
public class AbstractClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        animal Dog = new Dog();
        animal Cat = new Cat();
        
        // Ako klasa nema abstract ispred se moze izvesti ovaj kod
        // animal ani = new animal();
        
        Dog.makeNoise();
        Cat.makeNoise();
    }
    
}
