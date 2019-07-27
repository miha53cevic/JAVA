package Util;

public class Vector2<T> {
	
	public Vector2() {
		X = null;
		Y = null;
	}
	
	public Vector2(T x, T y) {
		this.X = x;
		this.Y = y;
	}
	
	public T X, Y;
}
