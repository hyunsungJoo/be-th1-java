package quiz.inheritance;

import java.util.Scanner;

public class PartTime extends Employee{
	int day;
	int perHour;
	int partSal;
	
	public PartTime() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("근무 일수를 입력하세요 : ");
		day = sc.nextInt();
		System.out.print("시간 당 단가를 입력하세요 : ");
		perHour = sc.nextInt();
		
		partSal = day * (perHour * 24);
	}
	
	public void print() {
		super.print();
		System.out.println(name + "의 급여 : " + partSal);
	}
}
