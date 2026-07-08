<<<<<<< HEAD
package com.coforge.day6;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10 , 20 , 3 , 40);
		
		list.forEach(n -> System.out.println(n));
		System.out.println("-----------------");
		
		list.forEach( n -> {
			if(n % 2 == 0)
				System.out.println(n);
		});
		
		System.out.println("-----------------");
		
		
		list.forEach(System.out::println);

}
}
=======
package com.coforge.day6;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10 , 20 , 3 , 40);
		
		list.forEach(n -> System.out.println(n));
		System.out.println("-----------------");
		
		list.forEach( n -> {
			if(n % 2 == 0)
				System.out.println(n);
		});
		
		System.out.println("-----------------");
		
		
		list.forEach(System.out::println);

}
}
>>>>>>> 21cb1583aead817d5fdb6759c6b55cbf04131396
