package day04_control.BreakeContinue;

public class BreakMain {
	public static void main(String[] args) {
		// 1~100가지 중에서 짝수의 개수 구하고 한 화면에 10개씩 출력하기
		
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				count++;
				if(count !=0 && count % 10 == 0) {
					System.out.println();
					continue;
				}
			}
		}
		
		
		
		
		
		//		lable : //식별자 : 
//		for(int i = 0; i < 6; i++) {
//			
//			for(int j = 1; j < 6; j++) {
//				
//				//if(j == 3) break lable;
//				if(j == 3) continue lable;
//				System.out.println("i :" +i+", j :" + j);
//			}
//		}// i end
	}
}
