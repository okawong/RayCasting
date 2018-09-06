package com.okawong.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EdgeTest {
	private Edge edge;
	@Before
	public void init(){
		edge = null;
	}
	@Test
	public void slopeCalculations() {
		Coordinate start = new Coordinate(-1, 0);
		Coordinate end = new Coordinate(4,8);
		edge = new Edge(start, end);
		double expectedSlope = 8.0/5.0;
		assertEquals(expectedSlope, edge.getSlope(), 0);
	}
	@Test
	public void intersectionCalculations(){
		Coordinate start = new Coordinate(-2, 0);
		Coordinate end = new Coordinate(3,10);
		edge = new Edge(start, end);
		double expectedIntersect = 4;
		assertEquals(expectedIntersect, edge.getYIntersect(), 0);
	}
}
