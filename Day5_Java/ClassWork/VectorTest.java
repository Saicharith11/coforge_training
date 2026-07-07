package com.coforge.day5;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;



public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		
		list.add(new Integer(10)); // Boxing
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println(list.get(1));

		
		//Remove
		System.out.println(list.remove(1));

		System.out.println(list);

		//Update
		System.out.println(list.set(4, 70));
		
		System.out.println(list);

		//Traverse using Index
		for(int i = 0 ;i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		// Traverse without INdex
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//Traverse Using Iterator 
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
	    Enumeration<Integer> e = list.elements();

	}

}
