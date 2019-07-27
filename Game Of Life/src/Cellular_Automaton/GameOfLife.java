package Cellular_Automaton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import display_manager.Display;

public class GameOfLife extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public static int CELL_SIZE = 8;
	
	public GameOfLife() {
		output 	= new ArrayList<Cell>();
		state 	= new ArrayList<Cell>();
		
		// Create cells
		int w = Display.ScreenWidth();
		int h = Display.ScreenHeight();
		
		for (int y = 0; y < h / CELL_SIZE; y++) {
			for (int x = 0; x < w / CELL_SIZE; x++) {
				output.add(new Cell(x * CELL_SIZE, y * CELL_SIZE));
				state .add(new Cell(x * CELL_SIZE, y * CELL_SIZE));
			}
		}
		
		// Randomize states
		for (int i = 0; i < output.size(); i++) {
			int random = (int)Math.floor(Math.random() * 2);
			
			if (random == 0) {
				output.get(i).alive = true;
			} else {
				output.get(i).alive = false;
			}
			
			state.get(i).alive = output.get(i).alive;
		}
	}

	void Logic() {
		
		// check every cell except the corner ones
		int w = Display.ScreenWidth()  / CELL_SIZE;
		int h = Display.ScreenHeight() / CELL_SIZE;
		
		int neighbours = 0;
		
		for (int y = 1; y < h - 1; y++) {
			for (int x = 1; x < w - 1; x++) {
				
				neighbours = 
				getNeighboursState(x - 1, y - 1) + getNeighboursState(x + 0, y - 1) +
				getNeighboursState(x + 1, y - 1) + getNeighboursState(x - 1, y + 0) + 
				getNeighboursState(x + 1, y + 0) + getNeighboursState(x - 1, y + 1) + 
				getNeighboursState(x + 0, y + 1) + getNeighboursState(x + 1, y + 1);
				
				// Run rules
				if (output.get(Index(x, y)).alive && neighbours != 2 && neighbours != 3) {
					state.get(Index(x, y)).alive = false;
				} else if (!output.get(Index(x, y)).alive && neighbours == 3) {
					state.get(Index(x, y)).alive = true;
				}
			}
		}
		
		// Swap buffers --> output takes on alive values from state
		for (int i = 0; i < output.size(); i++) {
			output.get(i).alive = state.get(i).alive;
		}
		
	}

	private int getNeighboursState(int x, int y) {
		if (output.get(Index(x, y)).alive) {
			return 1;
		} else {
			return 0;
		}
	}
	
	private int Index(int x, int y) {
		int w = Display.ScreenWidth() / CELL_SIZE;
		
		return (y * w) + x;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		// fill black background
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, Display.ScreenWidth(), Display.ScreenHeight());
		
		// draw cells
		for (var cell : output) {
			
			if (cell.alive) {
				g2d.setColor(Color.WHITE);
				g2d.fillRect(cell.position.X, cell.position.Y, CELL_SIZE, CELL_SIZE);
			}
		}
	}
	
	public void Refresh(double mili) {
		repaint();
		
		Logic();
		
		try {
			Thread.sleep((long)mili);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private ArrayList<Cell> output;
	private ArrayList<Cell> state;
}
