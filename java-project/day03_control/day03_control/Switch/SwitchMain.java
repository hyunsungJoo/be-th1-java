package day03_control.Switch;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j) = ");
		
		char ch = new Scanner(System.in).next().charAt(0);
		
		switch(ch) {
		case 's' : System.out.println("서울"); break;
		case 'd' : System.out.println("대구"); break;
		case 'b' : System.out.println("부산"); break;
		case 'j' : System.out.println("주제"); break;
		default : System.out.println("잘못 입력하였습니다."); System.exit(0); //System.exit(0) 프로그램강제종료
		}
		
		
		System.out.println("를(을) 선택하였습니다.");
	}

}
