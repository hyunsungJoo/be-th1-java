package quiz.scoreClass;

import java.util.Scanner;

public class Score {
	String name;
	int kor, eng, com, total;
	double avg;
	char grade;

	public Score() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name = ");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요(0~100) = ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요(0~100) = ");	
		eng = sc.nextInt();
		System.out.print("전산 점수를 입력하세요(0~100) = ");
		com = sc.nextInt();	
	}
	
	public Score(String name) {
		Scanner sc = new Scanner(System.in);
		this.name = name;
		
		System.out.print("국어 점수를 입력하세요(0~100) = ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요(0~100) = ");	
		eng = sc.nextInt();
		System.out.print("전산 점수를 입력하세요(0~100) = ");
		com = sc.nextInt();	
	}
	
	public Score(String name, int kor, int eng, int com) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}
	
	public void print_score() {
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.println("총점 : " + getTotal() + " 평균 : " + getAvg() + " 학점 : " + getGrade());
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getTotal() {
		return kor+eng+com;
	}

	public double getAvg() {
		return getTotal() / 3.0;
	}

	public char getGrade() {
		if(getAvg() >= 90) {
			return grade = 'A';
		}else if(getAvg() >= 80) {
			return grade = 'B';
		}else if(getAvg() >= 70) {
			return grade = 'C';
		}else if(getAvg() >= 60) {
			return grade = 'D';
		}else {
			return grade = 'F';
		}
	}
}
