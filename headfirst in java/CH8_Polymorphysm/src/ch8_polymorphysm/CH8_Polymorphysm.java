/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_polymorphysm;

import animals.*;
import java.util.ArrayList;

/**
 *
 * @author Mihael
 */
public class CH8_Polymorphysm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Type_Object> anim = new ArrayList<Type_Object>();
        anim.add(new Dog());
        
        Dog doggo = (Dog)anim.get(0);
        doggo.makeNoise();
    }
    
}
