import DisplayManager.*;
import Visualizer.*;

public class MainAppLoop {

	public static void main(String[] args) {
		
		// Create window
		display_manager.CreateDisplay(1280, 720, "Sorting Visualizer");
		
		// Setup visualizer
		Visualizer v = new Visualizer();
		display_manager.FRAME.getContentPane().add(v);
		
		v.run();
	}
}
