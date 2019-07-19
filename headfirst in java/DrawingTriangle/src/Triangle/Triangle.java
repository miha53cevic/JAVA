/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;

/**
 *
 * @author Mihael
 */
public class Triangle {
    public Triangle(int Size) {
        this.Size = Size;
    }
    
    public void Draw(char c) {
        int spaces = Size - 1;
        
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            for (int star = 0; star <= i * 2; star++) {
                System.out.print(c);
            }
            
            System.out.println();
            spaces--;
        }
    }
    
    private int Size;
}
