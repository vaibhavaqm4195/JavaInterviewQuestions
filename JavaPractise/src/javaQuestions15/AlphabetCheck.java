package javaQuestions15;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character to be checked: ");
		String ch = sc.next();
		char c = ch.charAt(0);
		
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
			System.out.println(c + " is an alphabet");
		}
		else {
			System.out.println(c + " is not an alphabet");
		}
		sc.close();

	}

}
