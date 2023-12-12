package day09_abstract.quiz;

import java.util.Scanner;

public class Subway extends Trans{
	
	@Override
	public void start() {
		num();
		System.out.println(num +"번 지하철이 출발합니다.");
	}

	@Override
	public void stop() {
		num();
		System.out.println(num +"번 지하철이 도착하였습니다.");
	}		
}
