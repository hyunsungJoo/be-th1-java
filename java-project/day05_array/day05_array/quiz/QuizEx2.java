package day05_array.quiz;

import java.util.Scanner;

// 문제2) 11월 한달(30일 기준) 간의 강수량을 입력 받아서 평균 구하는 프로그램 작성
public class QuizEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[30];
		double sum = 0;
		double avg;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("11월 " + (i+1) + "일의 강수량을 입력하세요 : ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		
		avg = sum / arr.length;
		System.out.println("11월 한달 간의 평균 강수량은 " + avg + " 입니다.");
		
	}
}
