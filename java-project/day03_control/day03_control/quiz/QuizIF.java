package day03_control.quiz;

import java.util.Scanner;

// 문제1) 두수 입력 받아서 큰 수 출력하기
public class QuizIF {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("더 큰수는 : " + num1);
		}
		else if(num1 < num2) {
			System.out.println("더 큰수는 : " + num2);
		}
		else {
			System.out.println("두 수는 같습니다.");
		}
		
	}

}
