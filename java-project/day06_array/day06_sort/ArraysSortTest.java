package day06_sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		int[] a = {7, 3, 2, 5, 8};
		int temp = 0;
		
		Arrays.sort(a);
		
		//오름차순
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		//내림차순
		for (int i = a.length - 1; i >=0; i--) {
			System.out.println(a[i]);
		}
	}
}
