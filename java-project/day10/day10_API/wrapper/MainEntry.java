package day10_API.wrapper;

class Point{}

public class MainEntry {
	public static void main(String[] args) {
		
		Integer Ia = new Integer(9);
		Integer Ib = new Integer("9");
		String su = "30";
		int x = 10;
		Point pt = new Point();
		
		System.out.println(pt); // 주소
		System.out.println(pt.toString());
		System.out.println(pt.hashCode());
		
		System.out.println(Ia); // 9
		System.out.println(Ia.hashCode());
		System.out.println(Ia.getClass().getName() + '@' + Integer.toHexString(Ia.hashCode()));
		
		//Boxing    vs    UnBoxing
		int y = 5;
		double d = 3.3;
//		d = y; //묵시적 형변환
		y = (int)d; // 명시적 형변환
		
		int c = Ia.intValue(); // jdk 4.x 이전까지 사용하던 메소드
		int e = Ib; // jdk 5.x 이후부터 auboxing, unboxing
		
		int num = Integer.parseInt(su); // 문자열 정수형태로 바꿈
		System.out.println(c + num);
		
		System.out.println(Ia.MAX_VALUE); // 21~~~
		System.out.println(Ia.MIN_VALUE); // -21~~~
		
		int f = Integer.parseInt("123");
		int g = Integer.parseInt("1111111", 2);
		System.out.println(f);
		System.out.println(g);
		
		int h = 3; // stack memory
		Integer i = new Integer(3); // heap memory
		
		System.out.println(Integer.toOctalString(10)); // 12
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toBinaryString(10)); // 2진수로 변경
	}
}
