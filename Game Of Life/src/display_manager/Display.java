package display_manager;

import javax.swing.JFrame;

public class Display {

	public static JFrame FRAME;
	
	public static void CreateDisplay(int Width, int Height, String Title) {
		FRAME = new JFrame(Title);
		FRAME.setSize(Width, Height);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.setVisible(true);
		FRAME.setResizable(false);
		
		ScrnWidth  = Width;
		ScrnHeight = Height;
	}
	
	public static int ScreenWidth() {
		return ScrnWidth;
	}
	
	public static int ScreenHeight() {
		return ScrnHeight;
	}
	
	private static int ScrnWidth;
	private static int ScrnHeight;
}
