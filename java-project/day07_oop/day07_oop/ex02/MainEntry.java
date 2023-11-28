package day07_oop.ex02;

public class MainEntry {
	public static void main(String[] args) {
		
		Point pt = new Point();
		pt.setX(100);
		pt.setY(100);
		pt.display();
		
		Circle c = new Circle();
		c.setX(3);
		c.setY(3);
		c.setR(3);
		c.display();
		
	}
}
