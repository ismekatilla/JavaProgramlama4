package org.ismek.collections;

import java.util.HashMap;

public class MapProgram {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 15);
		map.put(2, 12);
		map.put(3, 56);
		map.put(1, 45);
		
		System.out.println(map.get(1));
		
	}
}
