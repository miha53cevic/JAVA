package gui;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import gui.mywidget;

public class app {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		mywidget widget = new mywidget();
		JButton btn = new JButton("Click me!");
		JLabel label = new JLabel("I am a label");
		JButton btn2 = new JButton("Change Label");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, widget);
		frame.getContentPane().add(BorderLayout.SOUTH, btn);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.EAST, btn2);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.repaint();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Changed Label");
			}
		});
		
		frame.setSize(640, 480);
		frame.setVisible(true);
		
		for (int i = 0; i < 100; i++) {
			widget.animate(frame);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
