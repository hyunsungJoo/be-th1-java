package ex01;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기(배열로)
public class ScoreArrayEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stu = 3;
		int[] kor = new int[stu];
		int[] eng = new int[stu];
		int[] com = new int[stu];
		int[] total = new int[stu];
		double[] avg = new double[stu];
		char[] grade = new char[stu];
		int total_sum = 0;;
		double avg_sum = 0;
		
		int[] num = new int[stu];
		
		String[] name = new String[stu];
		
		for(int i = 0; i < stu; i++) {
			System.out.print("학생번호 : ");
			num[i] = sc.nextInt();
			
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			
			do {
			System.out.print("국어 점수를 입력하세요(0~100) = ");
			kor[i] = sc.nextInt();	
			} while ( kor[i] < 0 || kor[i] > 100 );
			
			do {
			System.out.print("영어 점수를 입력하세요(0~100) = ");
			eng[i] = sc.nextInt();	
			} while ( eng[i] < 0 || eng[i] > 100 );
			
			do {
			System.out.print("전산 점수를 입력하세요(0~100) = ");
			com[i] = sc.nextInt();	
			} while ( com[i] < 0 || com[i] > 100 );
			
			System.out.println();
			
			total[i] = kor[i] + eng[i] + com[i];
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
		
		for(int i = 0; i < stu; i++) {
			System.out.println(name[i] + "님의 성적표 *****");
			System.out.println("번호 : " + num[i]);
			System.out.println("국어 : " + kor[i] + " 영어 : " + eng[i] + " 전산 : " + com[i]);
			System.out.println("총점 : " + total[i] + " 평균 : " + avg[i] + " 학점 : " + grade[i]);
			System.out.println();
			total_sum += total[i];
			avg_sum += avg[i];
		}
		
		System.out.println("학생 전체의 총합 점수 : " + total_sum);
		System.out.println("학생 전체의 점수 평균 : " + avg_sum / stu);

		
		}
		
				
	}

