package javaInterviewQuestionsNL;

public class FibonacciSeries {

	public static void main(String[] args) {
		int upto = 20;
		int t1 = 0;
		int t2 = 1;
		
		for (int i = 1; i <= upto; i++) {
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

}
