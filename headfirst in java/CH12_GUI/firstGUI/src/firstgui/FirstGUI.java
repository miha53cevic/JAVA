/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Mihael
 */
public class FirstGUI implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public JFrame frame;
    public JButton button;
    
    public void run()
    {
        frame = new JFrame("My sick GUI");
        button = new JButton("Click meh!");
        
        frame.getContentPane().add(button);
        
        button.addActionListener(this);
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        FirstGUI gui = new FirstGUI();
        gui.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I have been clicked!");
    }
    
}
