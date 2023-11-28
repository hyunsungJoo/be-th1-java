package day07_instanceMethod;


class B{
	int x, y;
	
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}


public class InstanceMethod {
	public static void main (String[] args) {
		B b = new B(); // 객체 생성, 메모리에 할당, 생성자 함수 자동호출
		b.setData(1, 2);
	}
}
