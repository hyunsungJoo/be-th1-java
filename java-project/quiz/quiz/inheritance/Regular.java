package quiz.inheritance;

import java.util.Scanner;

public class Regular extends Employee{
	int sal;
	
	public Regular() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("급여를 입력하세요 : ");
		sal = sc.nextInt();
	}
	
	public void print() {
		super.print();
		System.out.println(name + "의 급여 : " + sal);
	}
}
