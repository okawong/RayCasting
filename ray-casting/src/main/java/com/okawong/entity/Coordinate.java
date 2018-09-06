package com.okawong.entity;

public class Coordinate {
	private int X;
	private int Y;
	public Coordinate(int X, int Y) {
		this.setX(X);
		this.setY(Y);
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	@Override 
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Coordinate)) {
			return false;
		}
		
		Coordinate c = (Coordinate) o;
		return Integer.compare(X, c.X) == 0 && Integer.compare(Y, c.Y) == 0;
	}
}
