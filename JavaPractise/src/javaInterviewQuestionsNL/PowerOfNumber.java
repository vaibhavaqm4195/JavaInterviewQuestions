package javaInterviewQuestionsNL;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get its power: ");
		int base = sc.nextInt();
		System.out.println("Enter a exponant to get its power: ");
		int exponant = sc.nextInt();	
		long result =1;
		
		while(exponant != 0) {
			result = result * base;
			--exponant;
		}
		System.out.println("Power of number is: "+result);
		sc.close();

	}

}
