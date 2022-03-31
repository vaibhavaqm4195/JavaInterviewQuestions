package javaQuestions15;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string to check Palindrome: ");
		String str = sc.next();
		String reverse = "";
		for(int i = str.length()-1;i >= 0; i--) {
			reverse = reverse +(str.charAt(i));
		}

		if(reverse.equals(str)) {
			System.out.println(str +" is a palindrome");
		}
		else {
			System.out.println(str +" is not a palindrome");
		}
		sc.close();
	}

}
