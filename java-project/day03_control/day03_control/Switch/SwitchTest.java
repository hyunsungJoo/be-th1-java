package day03_control.Switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input jumsu(k, e, c) = ");

		int total = (sc.nextInt() + sc.nextInt() + sc.nextInt());
		double avg = (double)total / 3;
		char grade;
		
		switch((int)avg/10) { //switch(total / 30) {
		case 10 : 
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F';
		}
	}

}
