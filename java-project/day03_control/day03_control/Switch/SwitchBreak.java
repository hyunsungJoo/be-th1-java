package day03_control.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j) = ");
		
		char ch = new Scanner(System.in).next().charAt(0);
		
		switch(ch) { // break가 없으면 해당case 후부터 다 실행
		case 's' : System.out.println("서울"); //break;
		case 'd' : System.out.println("대구"); //break;
		case 'b' : System.out.println("부산"); //break;
		case 'j' : System.out.println("주제"); //break;
		
		}
		
		
		System.out.println("를(을) 선택하였습니다.");
	}

}

