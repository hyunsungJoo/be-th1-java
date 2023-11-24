package day05_array.ex02;

public class MainEntry {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] {{1,2,3}, {4,5,6}};
		
		int[][] a = {{1, 2, 3},{4, 5, 6}};
		
		System.out.println("행의 길이 : " + a.length);
		System.out.println("열의 길이 : " + a[0].length);
		System.out.println("열의 길이 : " + a[1].length);
		
		
		for(int i = 0; i < a.length; i++) { //행
			for(int j =0; j < a[i].length; j++) {//열
//				System.out.print("a[" + i +"][" + j +"] = " + a[i][j] + "\t");
				System.out.print(a[i][j] + "\t");
			}// j end
			System.out.println();
		} //i end
	}

}




/*
package day05_array.ex02;

public class MainEntry {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] {{1,2,3}, {4,5,6}};
		
		int[][] a = {{1, 2, 3},{4, 5, 6}};
		
		
		for(int i = 0; i < 2; i++) { //행
			for(int j =0; j <3; j++) {//열
				System.out.print("a[" + i +"][" + j +"] = " + a[i][j] + "\t");
			}// j end
			System.out.println();
		} //i end
	}

}
*/
