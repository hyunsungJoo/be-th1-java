package day05_array.ex01;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		//1. 
		char[] ch; //배열선언
		ch = new char[4];
		
		//2.
		char[] ch2 = new char[4];
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[0]);
		System.out.println(ch2[1]);
		System.out.println("==================");
		for(int i = 0; i < 4; i++){
			System.out.println("ch2[" + i + "]  = " + ch2[i]);
		}
		
		System.out.println("==================");
		
		// 3.
		char[] ch3 = {'J', 'A', 'V', 'K', 'P', 'a'};
		System.out.println("배열의 길이 : " + ch.length);
		
		for(int i =0; i < ch.length; i++) {
			System.out.println("ch3[" + i + "] = " + ch3[i]);
		}
		
		//4.
		char[] ch4 = {};
		char[] ch5 = new char[]{};
		
	}

}
