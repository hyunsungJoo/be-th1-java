package day04_control.While;

import java.util.Scanner;

public class DoWhileEx01 {
	public static void main(String[] args) {
		
		int su ;
		
		do {
			System.out.println("jumsu(0~100) = ? ");
			su = new Scanner(System.in).nextInt();
			
//			if(su < 0 || su > 0) {
//				System.out.println("0 ~ 100 사이값만 넣으세요.");
//				System.exit(0);
//			}
			System.out.println(su);
		}while(su < 0 || su > 100);
	}
}
