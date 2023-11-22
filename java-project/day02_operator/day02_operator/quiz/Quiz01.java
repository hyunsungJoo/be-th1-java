package day02_operator.quiz;

public class Quiz01 {
	
	public static void main(String[] args) {
	
		int pay = 567890;
		
		System.out.println("만원 : "+ pay / 10000);
		pay = pay % 10000;
		
		System.out.println("천원 : "+ pay / 1000 );
		pay = pay % 1000;
		
		System.out.println("백원 : "+ pay / 100 );
		pay = pay % 100;
		
		System.out.println("십원 : "+ pay / 10 );
	
	
	}
}
