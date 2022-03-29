package javaQuestions15;

public class First100NaturalNumberSum {

	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum = sum+ i;
		}
		System.out.println("Sum of first 100 natural numbers is: " +sum);

	}

}
