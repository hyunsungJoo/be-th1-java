package day05_random;

import java.util.Scanner;

// 문제1) 업/다운 게임
// 1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를 줘서 입력받는다.
//그 입력 받은 숫자와 추출한 난수가 같은지 판정하는 프로그램 작성
public class UpDownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int result = (int)(Math.random() * 100) + 1;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("숫자를 입력하세요(도전횟수는 5회 입니다.) : ");
			num = sc.nextInt();
			if(num == result) {
				System.out.println(num + " 정답입니다!!!"); break;
			}
			else if(i == 4) {
				System.out.println("실패하였습니다!!!"); break;
			}
			else if(num > result) System.out.println("Down!!!");
			else if(num < result) System.out.println("Up!!!");
		}
	}
}
