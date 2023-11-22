package ex01;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기
public class SungJuk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("전산 점수를 입력하세요 : ");
		int com = sc.nextInt();
		
		int total = kor + eng + com;
		double avg = total / 3.0;
		char grade;
		
//		switch((int)avg/10) { //switch(total / 30) {
//		case 10 : 
//		case 9 : grade = 'A'; break;
//		case 8 : grade = 'B'; break;
//		case 7 : grade = 'C'; break;
//		case 6 : grade = 'D'; break;
//		default : grade = 'F';
		
		if(avg >= 90) {
			grade = 'A';
		}else if(avg >= 80) {
			grade = 'B';
		}else if(avg >= 70) {
			grade = 'C';
		}else if(avg >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("주현성님의 성적표 *****");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.println("총점 : " + total + " 평균 : " + avg + " 학점 : " + grade);
		}		
	}

