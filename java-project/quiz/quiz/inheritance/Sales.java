package quiz.inheritance;

import java.util.Scanner;

public class Sales extends Regular{
	double percent;
	double salesSal;
	
	public Sales(){
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("퍼센트를 입력하세요 : ");
		percent = sc.nextInt();
		salesSal = sal * (percent / 100 + 1);
		sal = (int)salesSal;
	}
	
	public void print() {
		super.print();
	}
}
