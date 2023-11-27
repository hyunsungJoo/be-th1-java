package day06_array.ex03;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		int[][][] a = new int[2][2][3]; // [면크기][행크기][열크기];
		//2.
		int[][][] b2 = new int[][][] {{ {1,2,3},{4,5,6} },{ {1,2,3},{4,5,6} }};
		//3.
		int[][][] a3 = {{ {1,2,3},{4,5,6} },{ {1,2,3},{4,5,6} }};
		
		System.out.println("면 길이 : " + a3.length);
		System.out.println("행 길이 : " + a3[0].length);
		System.out.println("열 길이 : " + a3[0][0].length);
		
		for (int i = 0; i < a3.length; i++) { //면
			
			for (int j = 0; j < a3[i].length; j++) { //행
				
				for (int k = 0; k < a3[i][j].length; k++) {
					System.out.print(a3[i][j][k] + "\t");
				} //k end
				System.out.println();
			} //j end
			System.out.println();
		}// i end
		
	}

}
