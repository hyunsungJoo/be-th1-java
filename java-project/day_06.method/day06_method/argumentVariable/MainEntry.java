package day06_method.argumentVariable;

public class MainEntry {
	
//	public static void plus(int x, int y) {
//		
//	}
//	
//	public static void plus(int x, int y, int z) {
//		
//	}
//
//	public static void plus(int x, int y, int z, int a) {
//	
//	}
	
	public static void plus(int...x) {// 가변길이 배열
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		plus(1,2,3,4,5);
		plus(1,2,3,4,5,6,7,8,9,10);
	}
}
