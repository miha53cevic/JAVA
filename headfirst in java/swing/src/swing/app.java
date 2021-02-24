package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTextArea textarea = new JTextArea();
		JScrollPane pane = new JScrollPane(textarea);
		JButton btn = new JButton("Clear");
		
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		frame.getContentPane().add(BorderLayout.CENTER, pane);
		frame.getContentPane().add(BorderLayout.SOUTH, btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textarea.setText(null);
			}
		});
		
		frame.setSize(640, 480);
		
		// Close on x button click
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// Center window
		frame.setLocationRelativeTo(null);
	}

}
