package ex01;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기
public class ScoreArrayEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int inwon = 3;
		int su = 3;
		int[][] subject = new int[inwon][su];
		String[] name = new String[su];
		int[] total = new int[inwon];
		double[] avg = new double[inwon];
		char[] grade = new char[inwon];
		
		
		for(int i = 0; i < inwon; i++) {
			System.out.println("name = ");
			name[i] = sc.next();	
			
			for(int j = 0; j < su; j++) {
				
				switch(j) {
				case 0 : 
					System.out.print("국어점수를 입력하세요(0~100) = ");
					subject[i][j] = sc.nextInt();
					total[i] += subject[i][j];
					break;
				case 1 : System.out.print("영어점수를 입력하세요(0~100) = ");
					subject[i][j] = sc.nextInt();
					total[i] += subject[i][j];
					break;
				case 2 : System.out.print("전산점수를 입력하세요(0~100) = ");
					subject[i][j] = sc.nextInt();
					total[i] += subject[i][j];
					break;
				}
			}
			
			System.out.println();
			avg[i] = total[i] / 3.0;
			if(avg[i] >= 90) {
				grade[i] = 'A';
			}else if(avg[i] >= 80) {
				grade[i] = 'B';
			}else if(avg[i] >= 70) {
				grade[i] = 'C';
			}else if(avg[i] >= 60) {
				grade[i] = 'D';
			}else {
				grade[i] = 'F';
			}
		}
		
		for(int i =0; i < inwon; i++) {
			System.out.println(name[i] + "님의 성적표 *****");
			
			for(int j = 0; j < su; j++) {
				System.out.println("점수 : " + subject[i][j]);
				
			}
			System.out.println("국어 : " + subject[i][0] + " 영어 : " + subject[i][1] + " 전산 : " + subject[i][2]);
			System.out.println("총점 : " + total[i] + " 평균 : " + avg[i] + " 학점 : " + grade[i]);
			System.out.println();
		}
		System.out.println();
		
	}		
}

