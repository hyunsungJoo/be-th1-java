package day03_control.For.quiz;

import java.util.Scanner;

public class QuizEx01 {
	public static void main(String[] args) {
		// 1. 원하는 숫자 입력 받아서 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("몇 단인지 입력하세요 : ");
//		int gugu = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(gugu + "*" + i + " = "+ gugu * i);
//		}
	
		// 문제) 1~100중에 3의 배수 합과 개수 구하는 프로그램 작성
//		int sum = 0;
//		int count = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 3 == 0) {
//				sum += i;
//				count++;
//			}
//		}
//		System.out.println("1~100중에 3의 배수의 합 : " + sum);
//		System.out.println("1~100중에 3의 배수의 개수 : " + count);
		
		//문제 1~100까지의 합
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
	
	}
	
	

}
