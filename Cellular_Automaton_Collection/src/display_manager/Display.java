package display_manager;

import javax.swing.JFrame;

public class Display {

	public Display(int WIDTH, int HEIGHT, String TITLE) {
		m_frame = new JFrame(TITLE);
		m_frame.setSize(WIDTH, HEIGHT);
		m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m_frame.setVisible(true);
		
		m_nScreenWidth	= WIDTH;
		m_nScreenHeight = HEIGHT;
	}
	
	private JFrame m_frame;
	private int m_nScreenWidth;
	private int m_nScreenHeight;
	
	public int getScreenWidth() {
		return m_nScreenWidth;
	}
	
	public int getScreenHeight() {
		return m_nScreenHeight;
	}
	
	public JFrame getFrame() {
		return m_frame;
	}
}
