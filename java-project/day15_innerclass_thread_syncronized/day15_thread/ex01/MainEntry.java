package day15_thread.ex01;

public class MainEntry {
	public static void main(String[] args) throws InterruptedException {
		
		//스레드 객체 생성 방식
		Thread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
//		t1.run(); // run()만 구현하는 것은 스레드 구현아님
		// start() 메서드는 스레드를 실행시켜주는 메서드
		t1.start(); // start()메서드를 실행하면 start()메소드가 run()을 유도해줌 
		t2.start();
		t3.start();
		// 출력 순서는 랜덤, 계속 바뀜
		// 스레드가 순차적으로 실행되는게 아닌 병행실행이 되기 때문에, 스레드의 실행이 일관적으로 나타나지 않음.

	}

}
