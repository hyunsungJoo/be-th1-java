package day15_thread.syncronized;

class Atm {
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	
	// 쓰레드를 동기화 하는 이유는 여러 개의 쓰레드가 같은 프로세스 내의 자원을 공유하면서 작업하는 경우에 서로의 작업이 다른 작업에 영향을 주기 때문.
	// synchoronized(동기화)는 해당 메서드 전체를 임계영역으로 지정
	// 동기화를 해주어야 올바른 값이 나옴.
	// 입금함수
	public synchronized void deposit(int amount, String name) {// synchoronized(동기화)를 적지 않고 실행해보면 값이 틀리게 나오는 걸 알 수 있음
		money += amount;
		System.out.println(name + " : 입금금액 " + amount);
	}
	
	//출금함수
	public synchronized void withdraw(int amount, String name) { 
		if((money - amount) > 0) {
			
			Thread.yield(); // 양보 
			
			money -= amount;
			System.out.println(name + " : 출금금액 " + amount);
		} else {
			System.out.println(name + " : 출금 못함(잔액부족!!)");
		}
	}
	
	public void getMoney() {
		System.out.println("          잔액은 : " + money);
	}
} // Atm end

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;
	

	public UserAtm(Atm obj, String name) {
		super(name); // Thread생성자 중에 name을 가지고있는 생성자에게로 감.
		this.obj = obj;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(flag) {
				obj.deposit((int)(Math.random() * 10 + 2) * 100, getName());
//				obj.getMoney();
			} else {
				obj.withdraw((int)(Math.random() * 10 + 2) * 100, getName());
			}
			flag = true;
			obj.getMoney();
		}
	}
} // UserAtm end


public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "김연아");
		UserAtm user2 = new UserAtm(at, "박태환");
		UserAtm user3 = new UserAtm(at, "강감찬");
		
		user1.start();
		user2.start();
		user3.start();
		
	}
}
