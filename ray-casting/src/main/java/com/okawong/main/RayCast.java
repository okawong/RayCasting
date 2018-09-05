package com.okawong.main;

import java.util.List;

public interface RayCast {
	public void addEdge(List<List<Integer>> coordinates);
	public boolean insideZone(List<Integer> coordinate);
}
