package day06_array.ex03;

//3차원배열 임의적인 데이터 입력 받아서 출력하기
public class QuizEx5 {
	public static void main(String[] args) {
		
		int[][][] a = new int[2][2][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = (int)(Math.random()*100);
					System.out.print(a[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
