/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dates;

import java.util.Date;

// Slicno using namespace std;
import static java.lang.System.*;

// Packagi su zapravo replacement za namespace

/**
 *
 * @author Mihael
 */
public class Dates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = String.format("%tc", new Date());
        String sa = String.format("%tr", new Date());
        
        out.println(s);
        out.println(sa);
    }
    
}
