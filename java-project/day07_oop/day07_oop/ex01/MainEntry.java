package day07_oop.ex01;

class Point{
	private int x, y; //멤버변수, int 0, double/float 0.0, String null로 초기화 된다.
	
	//멤버함수 - getter / setter method
	public void setX(int xx) { x = xx;}
	public int getX() {return x;}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		//System.out.println(x + ", " + y);
		System.out.println(getX() + ", " + getY());
	}
	
}// point end


class Circle{
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

public class MainEntry {
	public static void main(String[] args) {
		
		
		System.out.println("=========================");
		Point pt = new Point();
//		pt.x = 3;
//		pt.y = 5;
//		System.out.println(pt.x + ", " + pt.y);
		System.out.println(pt.getX() + ", " + pt.getY());
		pt.setX(3);
		pt.setY(3);
		System.out.println(pt.getX() + ", " + pt.getY());
		pt.display();
		
		
		Circle c = new Circle();
		c.setX(3);
		c.setY(3);
		c.setR(3);
		c.display();
		
	}
}// main end
