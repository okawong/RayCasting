package com.okawong.raycast;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.okawong.entity.Coordinate;
import com.okawong.entity.Edge;
import com.okawong.raycast.RayCastImpl;

public class RayCastTest {
	private RayCastImpl rayCastImpl;
	@Before
	public void init(){
		rayCastImpl =  new RayCastImpl();
	}
	@Test
	public void intersectionTest() {
		Edge e = new Edge(new Coordinate(0,0), new Coordinate(10,10));
		Coordinate c = new Coordinate(5,5);
		Coordinate d = new Coordinate(1,3);
		assertTrue(rayCastImpl.pointOnEdge(e, c));
		assertFalse(rayCastImpl.pointOnEdge(e, d));
	}

}
