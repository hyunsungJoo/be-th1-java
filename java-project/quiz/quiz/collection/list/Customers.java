package quiz.collection.list;

import java.util.Scanner;

class Customers {
	
	String name, address, tel;

	public Customers() {
		this.name = "noName";
		this.address = "Seoul";
		this.tel = "000-0000-0000";
	}

	public Customers(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		this.name = sc.next();
		System.out.print("주소를 입력하세요 : ");
		this.address = sc.next();
		System.out.print("전화번호를 입력하세요 : ");
		this.tel = sc.next();
	}
	
	public int delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("지울 리스트의 요소 번호를 입력하세요 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public int set() {
		Scanner sc = new Scanner(System.in);
		System.out.print("바꿀 리스트의 요소 번호를 입력하세요 : ");
		int num = sc.nextInt();
		add();
		return num;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	
}
