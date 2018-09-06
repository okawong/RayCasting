package com.okawong.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.okawong.entity.Edge;

public class RayCastImpl implements RayCast{
	Set<Edge> edgeSet = new HashSet<>();
	public void addEdge(Edge edge) {
		edgeSet.add(edge);
	}

	public boolean insideZone(List<Integer> coordinate) {
		// TODO Auto-generated method stub
		return false;
	}

}
