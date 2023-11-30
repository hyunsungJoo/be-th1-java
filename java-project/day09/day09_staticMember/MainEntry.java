package day09_staticMember;

class Atm {
	int count; // instance member
	static int total; // static member
	
	public Atm(int amount) {
		count += amount;
		total += amount;
	}
	
	public static void view() {
//		count += 100; // static 메서드에서는 static member만 사용가능
		total += 100;
	}
	
	public void show(int count, int total) {
		this.count = count;
//		this.total = total; // static member에는 this 사용불가
	}
	
	public void display() {
		count += 200;
		total += 200;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}


public class MainEntry {
	public static void main(String[] args) {
		
		Atm at = new Atm(1000);
		at.display();
		
		Atm at2 = new Atm(100);
		at2.display();
		
		System.out.println(Atm.total);
	
	}
}
