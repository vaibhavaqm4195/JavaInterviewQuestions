package javaQuestions15;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate a table :");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num +" * "+ i + " = " +(num*i));
		}
		sc.close();

	}

}
