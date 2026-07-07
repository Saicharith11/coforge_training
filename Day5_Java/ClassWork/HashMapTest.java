package com.coforge.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer , String> map = new HashMap<>();
		map.put(10, "CHAA");
		map.put(20, "CH");
		map.put(30, "RITH");
		map.put(40, "RED");
		map.put(50, "DY");
		System.out.println(map);
		map.remove(20);
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + " => " + map.get(key));
		}
		
		//Traverse The Map Collection
		
		Set<Entry<Integer , String>> entries = map.entrySet();
		for(Entry<Integer , String> entry : entries) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		
	}
}
