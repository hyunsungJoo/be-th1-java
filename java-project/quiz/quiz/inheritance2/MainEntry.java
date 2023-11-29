package quiz.inheritance2;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요(1번 : Person, 2번 :  Student) : ");
		int num = sc.nextInt();
		
		Person p = new Person();
		Student s = new Student();
		
		switch(num) {
		case 1 : 
			p.input();
			p.output();
			break;
		case 2 : 
			s.input();
			s.output();
			break;
		default : 
			System.out.println("번호를 잘못 입력 하였습니다.");
		}
	}
}
