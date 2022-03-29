package javaQuestions15;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check: ");
		String c = sc.next();
		char ch = c.charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch + " is vowel");
		}
		else {
			System.out.println(ch + " is consonent");
		}
		sc.close();

	}

}
