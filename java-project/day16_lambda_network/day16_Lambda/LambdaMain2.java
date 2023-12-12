/*
package day16_Lambda;

interface Message {
	int something(int x); // int 형태, parameter 1개인 경우
}

class Person {
	public void greeting(Message msg) {
		int su = msg.something(80);
		System.out.println("Number is : " + su);
	}
}

public class LambdaMain2 {
	public static void main(String[] args) {
		// Lamda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() { // return type, parameter value
			@Override
			public int something(int x) {
				System.out.println("parameter value : " + x);
				return 100;
			}
		});
		
		System.out.println("------------------------");
//		p.greeting((x) -> { // lamda 형태, 꼭 x 아니여도 됨.
		p.greeting( x -> { // 매개변수가 1개일때는 () 생략가능, int x 처럼 타입도 안써도 됨.
			System.out.println("parameter value : " + x);
			return x;
		});
		
		p.greeting( x -> 9999 ); // return만 있는 상태면 {}, ; 생략가능.
	}
}
*/

// 형식 : 
// (매개변수 목록) -> { 실행문 }


