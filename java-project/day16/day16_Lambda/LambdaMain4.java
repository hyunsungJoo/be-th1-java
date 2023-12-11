
package day16_Lambda;

// 람다식에 타입을 꼭 써야하는 상황이 있다.
interface Message {
	void something(int x, int y); // void 형태, parameter 여러개인 경우
//	void good(int x);
}

interface Talk {
	void something(String x, String y); // functional interface(1개의 함수만 가지고 있는 인터페이스, 예를 들어 Runnable interface)
}

class Person {
	public void greeting(Message msg) {
		msg.something(1, 2);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello", " World");
	}
}

public class LambdaMain4 {
	public static void main(String[] args) {
		// Lamda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {
			
			@Override
			public void something(int x, int y) {
				System.out.println("parameter value : " + x + ", " + y);
			}
		});
		
		System.out.println("------------------------");
		char ch = 'A';
//		p.greeting( (int x, int y) -> { // 매개변수 목록 2개 이상이면 () 생략하면 안됨. 람다형태
		p.greeting( (String x, String y) -> {
			System.out.println("parameter value : " + x + ", " + y);
			System.out.println(ch);
			
//			ch = 'B'; // 에러, 람다에서는 값 변경 안됨.
			
			num = 2222; // static 변수 값은 변경 가능함.
			System.out.println(num);
		});	
	}
	static int num = 30;
}

// 형식 : 
// (매개변수 목록) -> { 실행문 }


