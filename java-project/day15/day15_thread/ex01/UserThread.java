package day15_thread.ex01;

// Thread 클래스를 상속받아 만드는 방식
public class UserThread extends Thread {
	
	String name;
	
	public UserThread(String name) {
		this.name = name;
	}

	@Override // Thread클래스가 가지고 있는 run() 메서드 오버라이드
	public void run() { // 스레드 실행부(구현부), 스레드가 시작되면 run() 메서드부터 시작
		for (int i = 1; i <= 10; i++) {
			if(i == 7) {
				try { // sleep은 예외 발생하기 때문에 예외처리 해주어야함,
					sleep(3000); // sleep메소드는 정해진 시간만큼 대기하였다가 이후 일들을 처리, 1000 <=== 1초, 3초 쉬었다가 그 다음 실행됨.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i);
		}
//		super.run(); // 부모가 갖고 있는 run() 호출(아무것도 안 쓰여져있음)
	} // 
}
