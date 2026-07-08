package com.coforge.day4;

public class StringTest1 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("java");
		
		System.out.println(s1.equals(s2)); //False
		System.out.println(s1.equalsIgnoreCase(s2)); //True
		
		System.out.println(s1.length());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.charAt(1)); // a
		System.out.println(s1.lastIndexOf('a')); //3
		System.out.println(s1.indexOf('b')); // -1
		
		String s3 = s1.concat(" World"); // Java World
		System.out.println(s3.substring(3 , 7)); // a Wo
		System.out.println(s3.substring(3)); //a World

	}

}
