/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mihael
 */
public class Machine {
    public static void main(String[] args) {
        String[] wordList1  = {"hello", "yeet", "Reeeee", "uf"};
        String[] wordList2 = {"UwU", "uf"};
        
        System.out.println(wordList1.length);
        System.out.println(wordList2.length);
        
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * wordList1 .length);
            System.out.print(wordList1[rand] + " ");
            
        }
    }
    
}
