package util;

import java.util.HashMap;
import java.util.Map;

public class LookupTable<V> {
	

	public static Map<Integer, Pair<?, ?>> returnTable() {
		Map<Integer, Pair<?, ?>> map = new HashMap<>();
		
		map.put(2, new Pair<Integer, Integer>(0x80000001, 0)); //Magic number + shift amount.
		map.put(3, new Pair<>(0xAAAAAAAB, true));
		map.put(4, new Pair<Integer, Boolean>(0x80000001, 1));
		map.put(5, new Pair<>(0xCCCCCCCD, true));
		map.put(6, new Pair<Integer, Boolean>(0x2AAAAAAB, 0));
		map.put(7, new Pair<>(0xB6DB6DB7, true));
		map.put(8, new Pair<Integer, Boolean>(0x80000001, 2));
		map.put(9, new Pair<>(0x38E38E39, true));
		map.put(10, new Pair<Integer, Boolean>(0xCCCCCCCD, 3));
		
		
		
		return map;
	}
	
	
}
