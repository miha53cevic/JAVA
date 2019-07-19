/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingtriangle;

import Triangle.Triangle;

/**
 *
 * @author Mihael
 */
public class DrawingTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle t = new Triangle(10);
        t.Draw('*');
    }
    
}
