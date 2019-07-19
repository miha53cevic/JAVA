package mathlibrary;

import static_class.*;

/**
 *
 * @author Mihael
 */
public class MathLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(foo.getVariable());
        
        Duck a = new Duck();
        Duck b = new Duck();
        Duck c = new Duck();
        
        a.getDuckCount();
        
        // Random number from 1 - 10
        // Math.random() - 0.0 -> 1.0
        int rand = (int)Math.floor(Math.random() * 10) + 1;
        System.out.println("My random number is " + rand);
    }
    
}
