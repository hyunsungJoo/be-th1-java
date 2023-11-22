package day02_operator.quiz;

import java.util.*;

public class QuizScore {
	public static void main(String[] args) {
	
	/* Scanner 이용해서 데이터 처리하기
	int kor = 90, eng = 88, com = 100;
	
	int total = kor + eng + com;
	double avg = total / 3.0 ;
	*/
	Scanner sc = new Scanner(System.in);
	
	/*
	System.out.print("국어 점수를 입력하세요 : ");
	int kor = sc.nextInt();
	System.out.print("영어 점수를 입력하세요 : ");
	int eng = sc.nextInt();
	System.out.print("전산 점수를 입력하세요 : ");
	int com = sc.nextInt();
	*/
	System.out.print("kor, eng, com data input : ");
	
	//int total = kor + eng + com;
	//double avg = total / 3.0 ;
	
	System.out.println("국어 : " + sc.nextInt() + ", 영어 : " + sc.nextInt() + ", 전산 : " + sc.nextInt());
	//System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
	
	}
}
