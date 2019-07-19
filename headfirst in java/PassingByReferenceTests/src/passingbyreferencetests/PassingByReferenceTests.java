/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingbyreferencetests;

/**
 *
 * @author Mihael
 */
public class PassingByReferenceTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = new Integer(3);
        demo demo = new demo();
        demo.ChangeNum(num, 1);
        
        System.out.println(num);
        
        animal anim = new animal("Grrr");
        demo.changeName(anim);
        
        System.out.println(anim.name);
    }
    
}
