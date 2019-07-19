/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingmyownwidget;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mihael
 */
public class DrawingMyOwnWidget  {

    public JFrame frame;
    
    public void run()
    {
        frame = new JFrame("My sick GUI");
        
        MyDrawPannel widget = new MyDrawPannel();
        
        frame.getContentPane().add((widget));
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        DrawingMyOwnWidget gui = new DrawingMyOwnWidget();
        gui.run();
    }
    
}
