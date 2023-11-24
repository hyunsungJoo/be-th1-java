package day05_array.quiz;

import java.util.Scanner;

public class QuizEx4 {
	public static void main(String[] args) {
		
		int[][] a = new int[3][4];
		a[0][0] = 7; 
		a[0][1] = 2; 
		a[0][2] = 1; 
		a[0][3] = 3;
		a[1][0] = 10; 
		a[1][1] = 8; 
		a[1][2] = 9; 
		a[1][3] = 7;
		
		// 0,1,2,3
		for(int i =0; i < a[0].length; i++) {
			int sum = 0;
			//0,1 
			for(int j =0; j < a.length-1; j++) {
				sum += a[j][i];
			}
			a[a.length - 1][i] = sum;
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
