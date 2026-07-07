package com.coforge.day5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class HashSetTest {

    public static void main(String[] args) {

        Set<Integer> list = new LinkedHashSet<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20); // Duplicate - will not be added

        System.out.println("LinkedHashSet: " + list);

        // Check whether an element exists
        System.out.println("Contains 20: " + list.contains(20));

        // Remove an element
        System.out.println("Removed 20: " + list.remove(20));

        System.out.println("After removal: " + list);

        // Update 50 to 70
        list.remove(50);
        list.add(70);

        System.out.println("After update: " + list);

        // Traverse without index
        System.out.println("Using enhanced for loop:");

        for (Integer i : list) {
            System.out.println(i);
        }

        // Traverse using Iterator
        System.out.println("Using Iterator:");

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

