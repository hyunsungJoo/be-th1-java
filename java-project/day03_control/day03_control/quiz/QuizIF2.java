package day03_control.quiz;

import java.util.Scanner;

// 년도 입력 받아서 윤.평년 판정 프로그램 작성
public class QuizIF2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0 ) {
				System.out.println("윤년입니다.");
			}
			else {
				System.out.println("윤년이 아닙니다.");
			}
		}
		else {
			System.out.println("윤년이 아닙니다.");
			
			
		}
	}
}
