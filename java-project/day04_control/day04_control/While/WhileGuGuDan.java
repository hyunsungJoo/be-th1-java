package day04_control.While;

import java.util.Scanner;

public class WhileGuGuDan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 몇 단인지 입력하세요 : ");
		int gugu = sc.nextInt();
		int num = 1;
		
//		while(num <= 9) {
//			int result = gugu * num;
//			System.out.println(gugu + " * " + num + " = " + result);
//			num++;
//		}
		
		do {
			int result = gugu * num;
			System.out.println(gugu + " * " + num + " = " + result);
			num++;
		}while(num <= 9);
	} 
	
}
