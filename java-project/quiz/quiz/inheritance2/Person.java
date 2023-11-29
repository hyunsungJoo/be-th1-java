package quiz.inheritance2;

import java.util.Scanner;

public class Person {
	String name, gender;
	int age;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
	}
	
	public void output() {
		System.out.print("이름 : " + name + ", 성별 : " + gender + ", 나이 : " + age);
	}
}
