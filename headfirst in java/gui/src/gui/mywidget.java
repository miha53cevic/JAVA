package gui;

import javax.swing.*;
import java.awt.*;

public class mywidget extends JPanel {
	
	public int x = 0;
	public int y = 0;
	
	public void animate(JFrame frame) {
		x++;
		y++;
		frame.repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon("image.jpg").getImage();
		g.drawImage(img, 0, 0, this);
		
		Color c = new Color((int)(Math.random() * 0xFFFFFF));
		g.setColor(c);
		g.fillRect(x, y, 120, 40);
	}
}
