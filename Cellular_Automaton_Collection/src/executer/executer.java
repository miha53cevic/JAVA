package executer;

import display_manager.Display;

import cellular_automaton.*;

public class executer {

	public static void main(String[] args) {
		Display main = new Display(640, 480, "MainWindow");
		
		GameOfLife automaton = new GameOfLife(640, 480);
		
		while (true) {
			automaton.Refresh(16.6);
		}
	}
}
