/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandler;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Mihael
 */
public class EventHandler {

    public JFrame frame;
    public JButton button;
    
    public void run()
    {
        frame = new JFrame("My sick frame");
        button = new JButton("Click meh!");
        
        button.addActionListener(new ButtonActionListener());
        
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        EventHandler gui = new EventHandler();
        gui.run();
    }
    
    class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            button.setText("You clicked me!");
        }
    }
    
}
