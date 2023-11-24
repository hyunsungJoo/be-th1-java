package day05_random;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		// Math.random
		System.out.println(Math.random()); // 0.0 ~0.99999 미만 1포함x
		System.out.println(Math.random() * 5); // 0 ~ 4.999999
		System.out.println((int)Math.random() * 5); // 0 ~ 4
		
		System.out.println((int)(Math.random() * 5) + 1);
		
		for(int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random() * 45) + 1 + "\t");
		}
		System.out.println("========================");
		
		//Random class
		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(45)); // 0부터 44까지
		
			
			
			
		
	}

}

