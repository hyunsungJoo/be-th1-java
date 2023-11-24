package day05_array.quiz;

import java.util.Scanner;

public class QuizEx4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[][] = new int[3][4];
		
		for(int i = 0; i < num.length; i++) {
			int mul = 1;
			for(int j = 0; j < num[i].length; j++) {
				if(j == 3) {
					num[i][j] = mul;
					continue;
				}
				System.out.print("[" + i + "]"  + "[" +j + "]" + "요소 값을 입력하세요 : ");
				num[i][j] = sc.nextInt();
				mul *= num[i][j];
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
