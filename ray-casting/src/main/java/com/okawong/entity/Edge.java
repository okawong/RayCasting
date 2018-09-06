package com.okawong.entity;

public class Edge {
	private Coordinate start;
	private Coordinate end;
	public Edge(Coordinate start, Coordinate end) {
		this.setStart(start);
		this.setEnd(end);
	}
	public Coordinate getStart() {
		return start;
	}
	public void setStart(Coordinate start) {
		this.start = start;
	}
	public Coordinate getEnd() {
		return end;
	}
	public void setEnd(Coordinate end) {
		this.end = end;
	}
	public int getSlope() {
		return (end.getY() - start.getY())/(end.getX() - start.getY());
	}
	
	public int getYIntersect() {
		int expectedY = getSlope()*start.getX();
		return -1;
	}
	@Override 
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Edge)) {
			return false;
		}
		
		Edge e = (Edge) o;
		return start.equals(e.start) && end.equals(e.end);
	}
}
