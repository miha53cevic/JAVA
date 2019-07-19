/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_readingvalues;

import java.util.Scanner;

/**
 *
 * @author Mihael
 */
public class CH5_ReadingValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String line = read.nextLine();
       
       System.out.println(line);
    }
    
}
