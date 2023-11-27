package ex01;

import java.util.Scanner;

public class ScoreMethod {
	
	//성적
	public static void stu_score() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name = ");
		String name = sc.next();
		System.out.print("국어 점수를 입력하세요(0~100) = ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요(0~100) = ");	
		int eng = sc.nextInt();
		System.out.print("전산 점수를 입력하세요(0~100) = ");
		int com = sc.nextInt();
		
		int total = total(kor, eng, com);
		
		double avg = avg(total);
		
		char grade = grade(avg);
		
		System.out.println();
		print_score(name, kor, eng, com, total, avg, grade);
	}
	
	public static int total(int kor, int eng, int com) {
		int total = kor + eng + com;
		return total;
	}
	
	public static double avg(int total) {
		double avg = total / 3.0;
		return avg;
	}
	
	public static char grade(double avg) {
		if(avg >= 90) {
			return  'A';
		}else if(avg >= 80) {
			return  'B';
		}else if(avg >= 70) {
			return  'C';
		}else if(avg >= 60) {
			return  'D';
		}else {
			return  'F';
		}
	}
	
	public static void print_score(String name, int kor, int eng, int com, int total, double avg, char grade) {
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.println("총점 : " + total + " 평균 : " + avg + " 학점 : " + grade);
	}
			
	public static void main(String[] args) {
		stu_score();
	}

}
