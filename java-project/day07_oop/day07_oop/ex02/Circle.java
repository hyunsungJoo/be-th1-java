package day07_oop.ex02;

public class Circle {
	private int x,y,r;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void display() {
		System.out.println("x좌표 : " + x + " y좌표 : " + y + " 반지름 : " + r);
//		System.out.println("x좌표 : " + getX() + " y좌표 : " + getY() + " 반지름 : " +getR());
	}
}
