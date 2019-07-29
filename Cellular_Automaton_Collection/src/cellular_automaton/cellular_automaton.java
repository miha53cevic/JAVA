package cellular_automaton;

import javax.swing.JPanel;

import display_manager.*;

public abstract class cellular_automaton extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public cellular_automaton(int cell_width) {
		CELL_SIZE = cell_width;
	}
	
	abstract void Logic();
	
	protected int CalculateNeighbours(int x, int y) {
		// cell count in x and y axis
		int w = DISPLAY.getScreenWidth()  / CELL_SIZE;
		int h = DISPLAY.getScreenHeight() / CELL_SIZE;
		
		int neighbours = 0;
		
		if (x - 1 > 0) neighbours += isAlive(x - 1, y + 0) ? 1 : 0;	// convert Boolean to Integer
		if (x + 1 < w) neighbours += isAlive(x + 1, y + 0) ? 1 : 0;
		if (y - 1 > 0) neighbours += isAlive(x + 0, y - 1) ? 1 : 0;
		if (y + 1 < h) neighbours += isAlive(x + 0, y + 1) ? 1 : 0;
		
		if (x - 1 > 0 && y - 1 > 0) neighbours += isAlive(x - 1, y - 1) ? 1 : 0;
		if (x + 1 < w && y - 1 > 0) neighbours += isAlive(x + 1, y - 1) ? 1 : 0;
		if (x - 1 > 0 && y + 1 < h) neighbours += isAlive(x - 1, y + 1) ? 1 : 0;
		if (x + 1 < w && y + 1 < h) neighbours += isAlive(x + 1, y + 1) ? 1 : 0;
		
		return neighbours;
	}
	
	abstract Boolean isAlive(int x, int y);
	
	protected int CELL_INDEX(int x, int y) {
		int w = DISPLAY.getScreenWidth() / CELL_SIZE; 
		return (y * w) + x;
	}
	
	public void Refresh(double mili) {
		repaint();
		Logic();
		
		try {
			Thread.sleep((long)mili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected int CELL_SIZE;
	protected Display DISPLAY;
}
