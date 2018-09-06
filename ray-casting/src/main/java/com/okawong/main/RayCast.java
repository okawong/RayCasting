package com.okawong.main;

import java.util.List;

import com.okawong.entity.Coordinate;
import com.okawong.entity.Edge;

public interface RayCast {
	public void addEdge(Edge edge);
	public boolean insideZone(Coordinate coordinate);
}
