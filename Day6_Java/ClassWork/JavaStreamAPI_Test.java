<<<<<<< HEAD
package com.coforge.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPI_Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11 , 12 , 13 ,14 , 15);
		
		
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even); // [12, 14]

		long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count); // 2
		
		list.stream().filter(n -> n %  2 == 0).forEach(System.out::println);
		
		// 12
		//14
		
		list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);
		
		
		// Create a list of strings and give some values and print
		
		List<String> name = Arrays.asList("sai" , "Charith" , "Reddy");
		System.out.println(name);
		
		name.stream().filter(na -> na.contains("a")).forEach(System.out::println);
		
		
		name.stream().filter(na -> na.contains("a")).map(na -> na.length()).forEach(System.out::println);
	}
	
	

}
=======
package com.coforge.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPI_Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11 , 12 , 13 ,14 , 15);
		
		
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even); // [12, 14]

		long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count); // 2
		
		list.stream().filter(n -> n %  2 == 0).forEach(System.out::println);
		
		// 12
		//14
		
		list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);
		
		
		// Create a list of strings and give some values and print
		
		List<String> name = Arrays.asList("sai" , "Charith" , "Reddy");
		System.out.println(name);
		
		name.stream().filter(na -> na.contains("a")).forEach(System.out::println);
		
		
		name.stream().filter(na -> na.contains("a")).map(na -> na.length()).forEach(System.out::println);
	}
	
	

}
>>>>>>> 21cb1583aead817d5fdb6759c6b55cbf04131396
