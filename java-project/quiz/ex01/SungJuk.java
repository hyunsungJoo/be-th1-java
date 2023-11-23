package ex01;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기
public class SungJuk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, com;
		String name = null;
		name = sc.next();
		
		do {
		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("전산 점수를 입력하세요 : ");
		com = sc.nextInt();
		}while(kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100);
		
		
		int total = kor + eng + com;
		double avg = total / 3.0;
		char grade;
		
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
		
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.println("총점 : " + total + " 평균 : " + avg + " 학점 : " + grade);
		}		
	}

