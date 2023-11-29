package day08_defaultConstructor;

// fefault constructor & API
public class MainEntry {
	/**
	 * @param args 메인은 아무 값도 념겨 받지 않는다.
	 * @author kkk
	 * @param x 곱을 구하는 것에 첫번째 정수형 변수
	 * @param y 곱을 구하는 것에 첫번재 정수형 번수
	 * @param gob 변수는 x와 y의 두 정수의 곱을 저장 변수
	 */
		
	public static void main(String[] args) {
		int x, y, gob = 1;
		char ch = 'A';
		String msg;
		
		x = 5; y = 10;
		msg = "Hello!!";
		
		gob = gob(x, y);
		
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x + " * " + y + " = " + gob);
	}

	private static int gob(int x, int y) {
		return x * y;
	}

}
