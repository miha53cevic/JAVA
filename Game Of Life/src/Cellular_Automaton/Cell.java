package Cellular_Automaton;

import Util.*;

public class Cell {

	public Cell(int x, int y) {
		position = new Vector2<Integer>(x, y);
	}
	
	public Boolean alive;
	public Vector2<Integer> position;
}
