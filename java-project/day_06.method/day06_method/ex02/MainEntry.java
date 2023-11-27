package day06_method.ex02;

public class MainEntry {
	
// 매개변수 없고 리턴타입 있는경우
	public static String show() {
		//return "Hello String";
		String str = "Hello String";
		return str;
	}
	
	public static int ishow() {
		int su = 99;
		return su;
	}
	
// 매개변수 있고 리턴타입 있는경우
	public static int plus(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	
	public static void main(String[] args) {
		String msg = show();
		System.out.println(msg);
		System.out.println(show());
		
		int num = ishow();
		System.out.println(num);
		System.out.println(ishow());
		
		int sum = plus(1,2);
		System.out.println(plus(1,2));
		
	}

}
