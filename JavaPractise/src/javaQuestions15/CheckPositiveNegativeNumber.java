package javaQuestions15;

import java.util.Scanner;

public class CheckPositiveNegativeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be checked: ");
		double number = sc.nextDouble();
		
		if(number < 0.0) {
			System.out.println(number + " is a negative number");
		}
		else if(number > 0.0) {
			System.out.println(number + " is a positive number");
		}
		else {
			System.out.println(number + " is zero");
		}
		
		sc.close();

	}

}
