package DisplayManager;

import javax.swing.*;

public class display_manager {
	
	public static int SCREEN_WIDTH;
	public static int SCREEN_HEIGHT;
	public static JFrame FRAME;

	public static void CreateDisplay(int WIDTH, int HEIGHT, String title) {
		FRAME = new JFrame(title);
		FRAME.setSize(WIDTH, HEIGHT);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.setVisible(true);
		
		SCREEN_WIDTH 	= WIDTH;
		SCREEN_HEIGHT 	= HEIGHT;
	}
}
