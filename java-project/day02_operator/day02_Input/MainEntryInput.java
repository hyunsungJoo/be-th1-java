package day02_Input;

import java.util.Scanner;

public class MainEntryInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //객체생성, 메모리에 할당, 생성자 함수 자동 호출
		
		System.out.println("name, int input : ");
		int su = sc.nextInt();
		String name = sc.nextLine(); //공백 인식 못함
		
		System.out.println(su + ", " + name);	
		
		
//		System.out.println("name, str input : ");
////		String name = sc.next(); //공백 인식 못함
//		String name = sc.nextLine();
//		
//		System.out.println(name);
		
		
		
		
//		System.out.println("정수 데이터 입력 요망 : ");
//		
//		System.out.println("integer, double, char date input : ");
//		int x = sc.nextInt();
//		double y = sc.nextDouble();
//		char ch = sc.next().charAt(0);
//		
//		System.out.println(x + ", " + y + ", " + ch);
		
		/*
		 * int x = 3, y = 3;
		 * 
		 * if(x == y) System.out.println("same"); else System.out.println("not same");
		 * 
		 * String s1 = new String("korea"); String s2 = new String("korea");
		 * 
		 * //if(s1 == s2) System.out.println("same"); // if(s1.equals(s2))
		 * System.out.println("same");
		 * if(s1.equalsIgnoreCase(s2))System.out.println("same"); //대소문자 상관없이 비교해줌 else
		 * System.out.println("not same");
		 */
	}

}
