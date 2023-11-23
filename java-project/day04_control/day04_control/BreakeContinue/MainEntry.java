package day04_control.BreakeContinue;

public class MainEntry {
	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++) {
			if(i == 7) break;
			System.out.println(i);
		}
		for(int i = 1; i < 11; i++) {
			if(i == 7) continue;
			System.out.println(i);
		}
		
		System.out.println();
		for(int i = 1; i < 11; i++) {
			if(i % 2 != 0) continue;
			System.out.println(i);
		}
	}

}
