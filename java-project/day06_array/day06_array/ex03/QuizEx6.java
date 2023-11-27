package day06_array.ex03;

//주어진 2차원 배열 점수의 총점/평군 구하시오

public class QuizEx6 {
	public static void main(String[] args) {
		
		int[][] score = { { 98, 98, 90, 92, 99 },
							{ 81, 82, 83, 84, 85 },
							{ 71, 73, 75, 77, 79 },
							{ 60, 65, 60, 65, 69 },
							{ 77, 74, 79, 78, 72}};
		
		int[] total = new int[score.length];
		int[] avg = new int[score.length];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				total[i] += score[i][j];
			}
			avg[i] = total[i] / score[i].length;
			
			System.out.println("score[" + i + "] " +  "총합 : " + total[i] + " 평균 : " + avg[i]);
			
		}
		
	}
}
