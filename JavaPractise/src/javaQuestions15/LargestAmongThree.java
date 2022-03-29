package javaQuestions15;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		System.out.println("Enter third number: ");
		int z = sc.nextInt();
		
		if(x > y && x > z) {
			System.out.println("First number is gretest");
		}
		else if(y > z) {
			System.out.println("Second number is gretest");
		}
		else {
			System.out.println("Third number is greatest");
		}
		sc.close();

	}

}
