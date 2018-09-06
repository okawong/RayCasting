package com.okawong.main;

import java.util.HashSet;
import java.util.Set;

import com.okawong.entity.Coordinate;
import com.okawong.entity.Edge;

public class RayCastImpl implements RayCast{
	Set<Edge> edgeSet = new HashSet<>();
	public void addEdge(Edge edge) {
		edgeSet.add(edge);
	}

	public boolean insideZone(Coordinate coordinate) {
		int intersections = 0;
		for(Edge edge : edgeSet) {
			
		}
		return false;
	}
	private boolean pointOnEdge(Edge e, Coordinate c) {
		int slope = e.getSlope();
		return false;
	}
}
