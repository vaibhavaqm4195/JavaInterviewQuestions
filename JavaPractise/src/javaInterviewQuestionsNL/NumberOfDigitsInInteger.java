package javaInterviewQuestionsNL;

import java.util.Scanner;

public class NumberOfDigitsInInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to count its digit: ");
		int num = sc.nextInt();
		int count = 0;
		
		while(num != 0) {
			num = num/10;
			++count;
		}
		System.out.println("Number of digits in number is "+count);
		sc.close();
		

	}

}
