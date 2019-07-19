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
public class animal {
    public animal(String name) {
        this.name = name;
    }
    
    public void changeName(String name)
    {
        this.name = name;
    }
    
    public String name;
}
