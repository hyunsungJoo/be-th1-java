package day09_interface.ex01;

import day09_abstract.ex02.Shape;

interface A {
	int x  = 9; // interface - abstract methhod, final member만 가질 수 있다. final,abstract 생략가능
	
	public void show();
	public abstract void disp();
	public int plus(int x, int y);
}

interface B {
	void bView();
}

interface C {
	String name = "happy";
	public void draw();
}

interface D extends B { // interface간의 상속에서도 extends 키워드
	void dView();
}

class Rect implements C {

	@Override
	public void draw() {
		System.out.println(name + "님 반갑습니다.");
	}
}


//class Multi implements B,C,A extends Shape{ 안됨.
class Multi extends Shape implements B,C,A{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int plus(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		
		Rect r = new Rect();
		r.draw();
		
		C rr = new Rect();
		rr.draw();
		System.out.println(rr.name);
		
	}
}
