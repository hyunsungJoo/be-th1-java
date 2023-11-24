package day05_array.quiz;

public class QuizEx1 {
	public static void main(String[] args) {
		// 7의 개수를 뽑아주세요
		int[] su = {1, 7, 4, 7, 55, 90, 100, 7, 2, 7, 23};
		int count = 0;
		
		for(int i =0; i < su.length; i++) {
			if(su[i] == 7) {
				count++;
			}
		}
		System.out.println("su배열 요소 중 7의 개수는 : " + count + "개 입니다.");
	}
}
