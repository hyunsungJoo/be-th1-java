package day09_abstract.ex02;

public class MainEntry {
	public static void main(String[] args) {
		
		//3. 배열 이용한 형태
		Shape[] ss = new Shape[3]; // 배열 선언 및 생성
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		
		String[] name = {"Circle", "Rectangle", "Triangle"};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		System.out.println("********************");
		//2. shape부모 추상클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("원원원");
		
		sh = new Rectangle();
		sh.show("Rectangle");
		
		sh = new Triangle();
		sh.show("Triangle");
		
		
		System.out.println("********************");
		Circle c = new Circle();
		c.show("원");
		
		Triangle t = new Triangle();
		t.show("삼각형");
		
		Rectangle r = new Rectangle();
		r.show("사각형");
	}
}
