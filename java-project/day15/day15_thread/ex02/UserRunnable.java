package day15_thread.ex02;

//Runnable 인터페이스를 구현해 만드는 방식
public class UserRunnable implements Runnable {
	
	String name;
	public UserRunnable(String name) {
		this.name = name;
	}
	
	@Override // Runnable인터페이스가 가지고 있는 run메소드 오버라이드
	public void run() { // 스레드 실행부(구현부), 스레드가 시작되면 run() 메서드부터 시작

//		System.out.println("runnable run() call~~~");
		
		for (int i = 1; i < 11; i++) {
			if(i == 4) {
			try { // sleep은 항상 예외처리를 해주어야함
				Thread.sleep(1000); // sleep메서드를 안가지고 있기 때문에 Thread에서 가져옴(sleep은 static 메서드)
			} catch (InterruptedException e) {
				e.printStackTrace();
				}	
			System.out.println(name);
			}
		System.out.println(i);
		}			
	}
}
