package day06_method.ex01;

public class MainEntry {
//매개변수 없고 리턴타입 없는경우
	public static void line() { //함수정의
		System.out.println("----------------");
	}
	
//매개변수 있고 리턴타입 없는 경우
	public static void showName(String name, int age) {
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 살 이군요.");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		line(); //함수호출
		line();
		display();
		display();
		line();
		showName("김김김", 30);
		System.out.println("main end");
	}
	
	public static void display() {
		System.out.println("my name");
	}
}
