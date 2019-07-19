/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;
import Interface.Interface_Pet;

/**
 *
 * @author Mihael
 */
public class Dog extends Animal implements Interface_Pet {
    public void makeNoise() {
        System.out.println("Wuf");
    }
    
    public void Play() {
        System.out.println("Playing");
    }
    
    public void Roll() {
        System.out.println("Rolling");
    }
}
