package day05_array.quiz;

import java.util.Scanner;

//2차원배열 임의의 수 입력받아서 요소들의 합 출력
public class QuizEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[][] = new int[2][3];
		int total = 0;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print("a[" + (i+1) + "]" + "[" + (j+1) + "]" +   "의 요소를 입력하세요 : ");
				num[i][j] = sc.nextInt();
				total += num[i][j];
			}
		}
		
		System.out.println("배열 요소들의 합은 " + total +"입니다.");
	}

}
