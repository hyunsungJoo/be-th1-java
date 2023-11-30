package day09_abstract.quiz;

import java.util.Scanner;

public abstract class Trans {
	int num;

	public abstract void start();
	public abstract void stop();
	
	public void num() {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력해주세요 : ");
		num = sc.nextInt();
	}
}
