package day07_staticMethod;


class A{
	int x, y;
	
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}



public class StaticMethod {
	public static void main(String[] args) {
		A.setData(3, 5);
		A obj = new A(); // 객체생성, 메모리에 할당, 생성자 함수 자동호출
		obj.x = 9;
		System.out.println(obj.x);
		obj.setData(1, 2);
		
	}
}
