/*
package day16_Lambda;

interface Message {
	void something(); // void 형태인 경우
}

class Person {
	public void greeting(Message msg) {
		msg.something();
	}
}

public class MainEntry {
	public static void main(String[] args) {
		// Lamda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() { // 일반 상태
			@Override
			public void something() {
				System.out.println("good morning");
				System.out.println("한주 동안 열공합시다.");
			}
		});
		
		System.out.println("------------------------");
		p.greeting(() -> { // lamda 형태
			System.out.println("lamda good morning");
			System.out.println("lamda 한주 동안 열공합시다.");
		});
		
	}
}
*/

// public int sum(int x, int y) { return x + y; }
// 위에 메서드를 람다식으로
// ( x, y ) -> { x + y }
// () -> {}

