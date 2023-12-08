package day15_innerClass;

class OuterClass { // 외부클래스
	
	static int no;
	String message = "hello~~~";
	
	public void outerMethod() {
		System.out.println("outer method call");
//		System.out.println(su); // 오류, 바깥에서는 내부클래스 사용 불가능
//		show(); // 오류, 바깥에서는 내부클래스 사용 불가능
	}
	
	class InnerClass { // 내부 클래스
		int su = 99;
		
		public void show() {
			System.out.println(su); // 내부(자신의 것) 사용가능
			System.out.println(message); // 외부 클래스 멤버 사용 가능
		}
		
		public void disp() {
			outerMethod(); // 외부 클래스 메소드 호출
		}
	} // inner class end
} // outerClass end

public class MainEntry {
	public static void main(String[] args) {
		//1. 생성 방법
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();
		inner.show();
		System.out.println("---------------------");
		
		//2. 생성 방법
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
		
	}

}
