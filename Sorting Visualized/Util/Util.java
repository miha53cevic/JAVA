package Util;

public class Util {
	
	public static void ShuffleArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			int pos = (int)Math.floor(Math.random() * array.length);
			
			// Swap
			int temp 	= array[i];
			array[i] 	= array[pos];
			array[pos] 	= temp;
		}
	}
	
	// Maps values from one range to another
	public static float map(float s, float a1, float a2, float b1, float b2)
	{
		return b1 + ((s - a1) * (b2 - b1)) / (a2 - a1);
	}
	
	public static void SleepFor(long miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
