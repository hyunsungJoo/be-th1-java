package day03_exception;

import java.util.*;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("x, y = ");
		int x, y, result = 0;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y;
			
		} catch (Exception e) {
			//System.out.println("0으로 나눌수 없다.");
			// System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}

}



/*
package day03_exception;

public class MainEntry {
	public static void main(String[] args) {
		
		int x = 30, y = 0;
		int result = 0;
		
		if( y == 0) {
			System.out.println("0으로 나눌 수 없다.");
			return;
		} else {
			result = x/y;
		}
		System.out.println(result);
	}

}
*/



/*
package day03_exception;

public class MainEntry {
	public static void main(String[] args) {
		
		int x = 30, y = 0;
		int result = x / y;
		
		System.out.println(result);
		
	}

}
*/
