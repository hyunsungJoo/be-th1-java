package quiz.IO.ex02;

import java.util.Scanner;

public class Bmi {
	String name, bmi_name;
	int weight, height;
	char gender;
	double bmi;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.print("몸무게를 입력해주세요 : ");
		weight = sc.nextInt();
		System.out.print("키를 입력해주세요 : ");
		height = sc.nextInt();
		System.out.print("성별을 입력해주세요 : ");
		gender = sc.next().charAt(0);
	}
	
	public void cal() {
		if(gender == 'm') bmi = (getHeight() - 100) * 0.9;
		else if(gender == 'f') bmi = (getHeight() - 100) * 0.9;
		
		if(bmi < 18.5) bmi_name = "저체중";
		else if(bmi < 22.9) bmi_name = "정상";
		if(bmi < 24.9) bmi_name = "과체중";
		if(bmi > 25.0) bmi_name = "비만";
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
