/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_class;

/**
 *
 * @author Mihael
 */
public class Duck {
    private static int m_ducks = 0;
    
    public Duck() {
        m_ducks++;
    }
    
    public void getDuckCount()
    {
        System.out.println("There are " + (m_ducks) + " duck(s)!");
    }
}
