package day3.assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int a;
		a = sc.nextInt();
		
		int rev = 0;
		
		while ( a > 0) {
            int dig = a % 10;
            rev = rev * 10 + dig;
            a = a / 10;

		}
		
        System.out.println("Reverse = " + rev);

		sc.close();
	}

}
