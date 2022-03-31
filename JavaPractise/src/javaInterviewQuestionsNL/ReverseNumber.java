package javaInterviewQuestionsNL;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to print its reverse: ");
		int num = sc.nextInt();
		int reverse = 0;
		
		while(num != 0) {
			int reminder = num % 10;
			
			reverse = (reverse *10)+ reminder;
			num = num/10;
			
		}
		sc.close();
		System.out.println("Reversed number is "+reverse);

	}

}
