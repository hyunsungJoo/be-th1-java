package day03_homework;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0; 
		int num2 = 0;
		int result = 0;
		char op = 0;
		
		try {
			System.out.println("숫자를 입력하세요 : ");
			num1 = sc.nextInt();
			System.out.println("숫자를 입력하세요 : ");
			num2 = sc.nextInt();
			System.out.println("연산자를 입력하세요 : ");
			op = sc.next().charAt(0);
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(op);
			
			if(op == '+') result = num1+num2;
			else if(op == '-') result = num1-num2;
			else if(op == '*') result = num1*num2;
			else if(op == '/') result = num1/num2;
			System.out.println(num1 + " " + op + " " + num2 + " = "  + result);
			
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다.");
		} 		
	}
	
}
