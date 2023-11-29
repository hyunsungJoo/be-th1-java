package day08_inheritance.ex01;

public class Rectangle extends Point{
	
	private int x2,y2;
	
	public Rectangle() {
		super();
		x2 = y2 = 100;
	}
	
	public Rectangle(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void disp(){
		super.disp();
		System.out.println(x2 + ", " + y2);
	}
	

}
