package quiz.IO.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.println("2개의 정수와 1개의 연산자를 입력하세요 : ");
		
			int num1 = Integer.parseInt(br.readLine()); // 무조건 예외발생
			char cal = br.readLine().charAt(0);
			int num2 = Integer.parseInt(br.readLine());
		
			if(cal == '+') {
				System.out.println("num1 + num2 = " + (num1 + num2));
				break;
			} else if(cal == '-') {
				System.out.println("num1 - num2 = " + (num1 + num2));
				break;
			} else if(cal == '*') {
				System.out.println("num1 * num2 = " + (num1 * num2));
				break;
			} else if(cal == '/') {
				System.out.println("num1 + num2 = " + (num1 / num2));
				break;
			} else {
				System.out.println("다시 입력해주세요.");
				System.out.println();
			}
		}
	}
}
