package day03_control.quiz;

import java.util.Scanner;

public class IfScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목1 점수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("과목2 점수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println("과목3 점수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		int total = num1 + num2 + num3;
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
		
		System.out.println("성적은 " + grade + "입니다.");
	}
}
