package quiz.inheritance;

import java.util.Scanner;

public class Employee {
	String num, name, dept, pNum;
	
	public Employee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번을 입력하세요 : ");
		num = sc.next();
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("부서를 입력하세요 : ");
		dept = sc.next();
		System.out.print("전화번호를 입력하세요 : ");
		pNum = sc.next();
	}
	
	public void print() {
		System.out.println("사번 : " + num + ", 이름 : " + name + ", 부서 : " + dept + ", 연락처 : " + pNum);
	}
}
