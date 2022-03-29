package javaQuestions15;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 64;
		int b = -5;
		System.out.println("Before Swapping value of a is " + a +" value of b is " + b);
		
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After Swapping value of a is " + a +" value of b is " + b);
		
		
		//Without temp
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After Swapping value of a is " + a +" value of b is " + b);
				
		
	}

}
