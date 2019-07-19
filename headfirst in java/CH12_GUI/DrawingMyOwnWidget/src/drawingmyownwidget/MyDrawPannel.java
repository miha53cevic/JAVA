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
public class MyDrawPannel extends JPanel {
    @Override
    public void paintComponent(Graphics g)
    {
        // Background colour
        g.setColor(Color.BLACK);
        g.fillRect(0,0, this.getWidth(), this.getHeight());
        
        g.setColor(Color.RED);  
        g.fillRect(20, 50, 50, 50);
        
        Image img = new ImageIcon("D:/Java Projects/HeadFirst Into Java/CH12_GUI/DrawingMyOwnWidget/pic.jpg").getImage();
        g.drawImage(img, 0, 0, this);
        
        int r = (int)Math.floor(Math.random() * 256);
        int gr = (int)Math.floor(Math.random() * 256);
        int b = (int)Math.floor(Math.random() * 256);
        
        Color c = new Color(r, gr, b);
        g.setColor(c);
        g.fillOval(100, 100, 20, 20);
        
        // Changing graphics to graphics2D because of polymorphism
        Graphics2D g2d = (Graphics2D) g;
        
        GradientPaint gradient = new GradientPaint(0, 0, Color.RED, 30, 0, Color.GREEN);
        g2d.setPaint(gradient);
        
        g2d.fillOval(0, 150, 20, 20);
    }
}
