package executer;

import display_manager.Display;
import java.awt.Dimension;

import Cellular_Automaton.*;

public class Executer {
	
	public static void main(String[] args) {
		
		Display.CreateDisplay(1280, 768, "Cellular Automaton");
		
		GameOfLife automaton = new GameOfLife();
		automaton.setPreferredSize(new Dimension(Display.ScreenWidth(), Display.ScreenHeight()));
		
		Display.FRAME.getContentPane().add(automaton);
		Display.FRAME.pack();
		
		while (true) {
			automaton.Refresh(16.6);
		}
	}
}
