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
public class demo {
    public void ChangeNum(int num, int offset)
    {
        num += offset;
    }
    
    public void changeName(animal anim) {
        anim.changeName("UwU");
    }
}
