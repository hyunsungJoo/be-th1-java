package day04_control.While;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("for ---");
		for(int i = 1; i < 4; i++) {
			System.out.print(i + "\t");
		}
		
		System.out.println("\nwhile~~~");
		int a = 1; //while, do while 사용전에 변수 값 초기화 해주어야함.
		while(a<=3) { // while(a++ <=3) {System.out.print(a + "\t");}증감식 쓰기 싫을 때
			System.out.print(a + "\t");
			a++;
		}
		a = 1;
		
		do {
			System.out.print(a+ "\t");
			a++;
		} while(a <=3); // 문장종결기호 ; 필수!
	}
	
}
