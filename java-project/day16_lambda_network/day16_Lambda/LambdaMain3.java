/*
package day16_Lambda;

interface Message {
	int something(int x, int y); // int 형태, parameter 여러개인 경우
}

class Person {
	public void greeting(Message msg) {
		int su = msg.something(1, 2);
		System.out.println("Number is : " + su);
	}
}

public class LambdaMain3 {
	public static void main(String[] args) {
		// Lamda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() { // return type, parameter value
			@Override
			public int something(int x, int y) {
				System.out.println("parameter value : " + x + ", " + y);
				return 100;
			}
		});
		
		System.out.println("------------------------");
		p.greeting( (x, y) -> { // 매개변수 목록 2개 이상이면 () 생략하면 안됨. 람다형태
			System.out.println("parameter value : " + x + ", " + y);
			return x + y;
		});
		
		p.greeting( (x, y) -> { return x + y; } ); // 아래처럼 간략하게 가능함.
		
		p.greeting( (x, y) -> x + y ); // return만 있는 상태면 {}, ; 생략가능.
				
	}
}
*/

// 형식 : 
// (매개변수 목록) -> { 실행문 }


