package day03_control.Switch.quiz;

import java.util.Scanner;

public class QuizSwitchEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num % 2) {
		case 0 : System.out.println("짝수입니다."); break;
		case 1 : System.out.println("홀수입니다."); break;
		default : System.out.println("잘못 입력하였습니다.");
		}
		
	}

}
