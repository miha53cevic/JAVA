package cellular_automaton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;

import Utilities.Util;
import display_manager.Display;

public class GameOfLife extends cellular_automaton {
	private static final long serialVersionUID = 1L;

	public GameOfLife(int w, int h) {
		// set quad width
		super(8);
		
		DISPLAY = new Display(w, h, "Game Of Life", JFrame.DISPOSE_ON_CLOSE);
		
		this.setPreferredSize(new Dimension(w, h));
		DISPLAY.getFrame().getContentPane().add(this);
		DISPLAY.getFrame().pack();
		
		// setup cells
		output = new ArrayList<Cell>();
		state  = new ArrayList<Cell>();
		
		for (int y = 0; y < h / CELL_SIZE; y++) {
			for (int x = 0; x < w / CELL_SIZE; x++) {
				output.add(new Cell(x * CELL_SIZE, y * CELL_SIZE));
				state .add(new Cell(x * CELL_SIZE, y * CELL_SIZE));
			}
		}
		
		for (int i = 0; i < output.size(); i++) {
			int random = Util.rand(2);
			
			if (random == 0)	output.get(i).state = CELL_STATE.ALIVE;
			else 				output.get(i).state = CELL_STATE.DEAD;
			
			// at the start both output and state are the same
			state.get(i).state = output.get(i).state;
		}
	}
	
	private class Cell {
		
		public Cell(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int x, y;
		public CELL_STATE state;
	}
	
	private enum CELL_STATE {
		ALIVE, DEAD
	}
	
	private ArrayList<Cell> output;
	private ArrayList<Cell> state;
	
	public void Refresh(double mili) {
		repaint();
		Logic();
		
		// sleep for
		try {
			Thread.sleep((long)mili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override 
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		// fill background black
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, DISPLAY.getScreenWidth(), DISPLAY.getScreenHeight());
		
		for (var cell : output) {
			if (cell.state == CELL_STATE.ALIVE) {
				g2d.setColor(Color.WHITE);
				g2d.fillRect(cell.x, cell.y, CELL_SIZE, CELL_SIZE);
			}
		}
	}

	@Override
	void Logic() {
		// get neighbours
		for (int y = 0; y < DISPLAY.getScreenHeight() / CELL_SIZE; y++) {
			for (int x = 0; x < DISPLAY.getScreenWidth() / CELL_SIZE; x++) {
				int neighbours = CalculateNeighbours(x, y);
				
				// apply game of life rules
				if (isAlive(x, y) && neighbours != 2 && neighbours != 3) {
					state.get(CELL_INDEX(x, y)).state = CELL_STATE.DEAD;
				} else if (!isAlive(x, y) && neighbours == 3) {
					state.get(CELL_INDEX(x, y)).state = CELL_STATE.ALIVE;
				}
			}
		}
		
		// output = state
		for (int i = 0; i < output.size(); i++) {
			output.get(i).state = state.get(i).state;
		}
	}
	
	@Override
	Boolean isAlive(int x, int y) {
		if (output.get(CELL_INDEX(x, y)).state == CELL_STATE.ALIVE) {
			return true;
		} else {
			return false;
		}
	}
}
