package cellular_automaton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

import Utilities.Util;
import display_manager.Display;

public class BriansBrain extends cellular_automaton {
	private static final long serialVersionUID = 236043961766597672L;

	public BriansBrain(int w, int h) {
		super(4);
		
		// setup display
		DISPLAY = new Display(w, h, "BriansBrain", JFrame.DISPOSE_ON_CLOSE);
		DISPLAY.getFrame().getContentPane().add(this);
		DISPLAY.getFrame().setPreferredSize(new Dimension(w, h));
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
		
		// randomise starting states
		for (int i = 0; i < output.size(); i++) {
			int random = Util.rand(3);
			
			if (random == 0)		output.get(i).state = CELL_STATE.ON;
			else if (random == 1) 	output.get(i).state = CELL_STATE.DYING;
			else if (random == 2)   output.get(i).state = CELL_STATE.OFF;
			
			// at the start both output and state are the same
			state.get(i).state = output.get(i).state;
		}
	}
	
	private ArrayList<Cell> output;
	private ArrayList<Cell> state;
	
	private class Cell {
		public Cell(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int x, y;
		public CELL_STATE state;
	}
	
	private enum CELL_STATE {
		ON, DYING, OFF
	}
	
	@Override
	void Logic() {
		for (int y = 0; y < DISPLAY.getScreenHeight() / CELL_SIZE; y++) {
			for (int x = 0; x < DISPLAY.getScreenWidth() / CELL_SIZE; x++) {
				int neighbours = CalculateNeighbours(x, y);
				
				// rules
				if (getCellState(x, y) == CELL_STATE.OFF && neighbours == 2) {
					state.get(CELL_INDEX(x, y)).state = CELL_STATE.ON;
				} else if (getCellState(x, y) == CELL_STATE.ON) {
					state.get(CELL_INDEX(x, y)).state = CELL_STATE.DYING;
				} else if (getCellState(x, y) == CELL_STATE.DYING) {
					state.get(CELL_INDEX(x, y)).state = CELL_STATE.OFF;
				}
			}
		}
		
		// output Cell states = state Cell states
		for (int i = 0; i < output.size(); i++) {
			output.get(i).state = state.get(i).state;
		}
	}

	@Override
	Boolean isAlive(int x, int y) {
		if (output.get(CELL_INDEX(x, y)).state == CELL_STATE.ON) {
			return true;
		} else {
			return false;
		}
	}
	
	private CELL_STATE getCellState(int x, int y) {
		return output.get(CELL_INDEX(x, y)).state;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		// fill background
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, DISPLAY.getScreenWidth(), DISPLAY.getScreenHeight());
		
		// draw cells
		for (var cell : output) {
			if (cell.state == CELL_STATE.ON) {
				g.setColor(Color.WHITE);
			} else if (cell.state == CELL_STATE.DYING) {
				g.setColor(Color.BLUE);
			}
			
			if (cell.state != CELL_STATE.OFF) {
				g.fillRect(cell.x, cell.y, CELL_SIZE, CELL_SIZE);
			}
		}
	}
}
