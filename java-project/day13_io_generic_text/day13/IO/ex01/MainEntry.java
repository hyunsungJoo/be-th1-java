package day13.IO.ex01;

import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		
		InputStream is = System.in; // 표준입력
		
		try {
			System.out.println("단일 문자 입력 : ");
//			int num = is.read(); // 예외발생, '0' ~ '9' : 48 ~ 57 (ASCII code)
			
			int num = is.read() - 48;
			
			is.read();
			is.read(); // 문제 발생 처리 - 자바에서는 '문자' 2바이트 처리됨
			
			int num2 = is.read() -48;
			
			System.out.println(num + num2);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
