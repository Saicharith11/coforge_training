package day3.assignment;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Marks");
		int a;
		a = sc.nextInt();
		
		if(a > 90 && a <= 100) {
			System.out.println("Grade A+");
		} else if ( a > 80 && a <= 90 ) {
			System.out.println("Grade A");
		} else if ( a > 70 && a <= 80 ) {
			System.out.println("Grade B");
		} else if ( a > 60 && a <= 70 ) {
			System.out.println("Grade C");
		} else if ( a > 50 && a <= 60 ) {
			System.out.println("Grade D");
		} else if (a > 0 && a <= 50){
			System.out.println("Fail");
		} else {
			System.out.println("Error");
		}
	}

}
