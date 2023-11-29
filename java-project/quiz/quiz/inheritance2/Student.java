package quiz.inheritance2;

import java.util.Scanner;

public class Student extends Person{
	int score;
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		score = sc.nextInt();
	}
	
	public void output() {
		super.output();
		System.out.print(", 성적 : " + score);
	}
}
