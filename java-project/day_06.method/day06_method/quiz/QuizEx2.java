package day06_method.quiz;

public class QuizEx2 {
	
	public static int plus(int x, int y) {
		return x + y;
	}
	
	public static int minus(int x, int y) {
		return x - y;
	}
	
	public static void mul(int x, int y) {
		System.out.println(x*y);
	}
	
	public static void div(int x, int y) {
		try {
		System.out.println(x/y);
		} catch(Exception e) {
		System.out.println("0으로 나눌수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(plus(5,2));
		System.out.println(minus(5,2));
		mul(5,2);
		div(5,2);
		div(5,0);
	}

}
