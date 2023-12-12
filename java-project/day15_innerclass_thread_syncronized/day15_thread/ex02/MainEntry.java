package day15_thread.ex02;

public class MainEntry {
	public static void main(String[] args) {
		
		// Runnable 객체 생성 방식
//		Runnable t1 = new UserRunnable("u1"); 
////		t1.start(); // 오류!!! Runnable은 인터페이스이기 때문에 start메소드를 가지고있지 않음, start는 Thread클래스만 가지고 있음.
//		Thread tt1 = new Thread(t1); // start메소드를 사용할수 없기 때문에 이렇게 생성 해주어야함.
//		tt1.start();
		
		// 위에 생성하는 방식을 짧게 한줄로 선언시킨 방식
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
	}
}
