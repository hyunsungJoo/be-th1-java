package day05_array.ex01;

public class ForeachTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for (int item : arr) {
//			System.out.println(item);
//		}
		
		int[] score = {78 , 70, 88, 99, 58};		
		int total = 0;
		for (int i : score) {
			total += i;
		}
		System.out.println(total);
	}

}

/* 형식
	for(자료형 변수명 : 컬렉션명 or 배열명){
		반복구문;
	}

*/