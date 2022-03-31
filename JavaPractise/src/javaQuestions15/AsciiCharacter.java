package javaQuestions15;

public class AsciiCharacter {

	public static void main(String[] args) {
		char c ='%';
		int ascii = c;
		System.out.println("Ascii value of character is: "+ascii);
		
		String str ="Payment $100 paid";
		System.out.println(str.indexOf("$"));
		System.out.println(str.charAt(8));
		System.out.println(str.substring(9));
	}

}
