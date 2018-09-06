package com.okawong.entity;

public class Coordinate {
	private double X;
	private double Y;
	public Coordinate(double X, double Y) {
		this.setX(X);
		this.setY(Y);
	}
	public double getX() {
		return X;
	}
	public void setX(double x) {
		X = x;
	}
	public double getY() {
		return Y;
	}
	public void setY(double y) {
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
		return Double.compare(X, c.X) == 0 && Double.compare(Y, c.Y) == 0;
	}
}
