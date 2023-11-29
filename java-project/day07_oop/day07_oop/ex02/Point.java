package day07_oop.ex02;

public class Point {
	private int x, y; // 멤버변수
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) { 
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void display() {
		System.out.println(x + ", " + y);
	}
	
//	@Override
//	public String toString() {
//		return x + ", " + y;
//	}
	
	
	

}
