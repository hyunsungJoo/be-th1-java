package day03_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 두개를 입력해주세요.");
			System.out.println("integer1 : ");
			int num1 = sc.nextInt();
			System.out.println("integer2 : ");
			int num2 = sc.nextInt();
			System.out.println("num1 / num2 = " + num1 / num2);
			
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			System.out.println("올바른 숫자를 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("완료");
		}
	}

}
