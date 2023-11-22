package day03_control.quiz;

import java.util. *;

//전산,영어,국어 점수 입력 받아서 평균 60점이상이고, 각 과목 과락 40점이하면 과목 불합격 처리하는 프로그램 작성
public class QuizIF3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("전산 점수를 입력하세요 : ");
		int com = sc.nextInt();
		
		int total = kor + eng + com;
		int avg = total / 3;
		
		if(avg > 60) {
			if (kor < 40){
				System.out.println("국어가 과락입니다");
			}
			else if (eng < 40){
				System.out.println("영어가 과락입니다");
			}
			else if (com < 40){
				System.out.println("전산이 과락입니다");
			}
			else
				System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
	}

}
