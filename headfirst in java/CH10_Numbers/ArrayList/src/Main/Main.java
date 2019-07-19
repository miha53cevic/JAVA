/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Mihael
 */
public class Main {
    public static void main(String[] arguments)
    {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(Math.random());
        
        System.out.println(list.get(0));
    }
}
