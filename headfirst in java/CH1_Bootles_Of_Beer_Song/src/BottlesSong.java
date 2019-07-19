/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mihael
 */

/*
    SONG
        99 bottles of beer on the wall, 99 bottles of beer.
        Take one down and pass it around, 98 bottles of beer on the wall.
*/

public class BottlesSong {
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            int temp = i - 1;
            
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + temp + " bottles of beer on the wall.");
        }
    }
}
