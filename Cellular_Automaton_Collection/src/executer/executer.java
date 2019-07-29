package executer;

import display_manager.Display;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import cellular_automaton.*;

public class executer {
	
	public static void main(String[] args) {
		JButton button1 = new JButton("Game Of Life");
		JButton button2 = new JButton("Brian's Brain");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(button1);
		panel.add(Box.createVerticalStrut(50));
		panel.add(button2);
		panel.add(Box.createHorizontalStrut(150));
		
		Display main = new Display(640, 480, "MainWindow", JFrame.EXIT_ON_CLOSE);
		main.getFrame().add(panel);
		
		cellular_automaton automaton = new BriansBrain(640, 480);
		
		while (true) {
			automaton.Refresh(16.6);
		}
	}
}
