package day09_abstract.ex01;

abstract class Shape {
	double result = 0;
	
	abstract public double calc();
	abstract public void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
	
	@Override
	public String toString() {
		return "Super class Shape";
	}
}

class Circle extends Shape {
	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}
	
	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다.");
	}
}

class Triangle extends Shape{
	int w = 3, h = 5;

	@Override
	public double calc() {
		result = (w * h) / 2;
		return result;
		}

		@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + " 인 삼각형을 그렸습니다.");
	}
}

class Square extends Shape{
	int x = 3, y = 5;

	@Override
	public double calc() {
		result = x * y;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + " 인 사각형을 그렸습니다.");
		
	}

}


public class MainEntry {
	public static void main(String main) {
		
		Shape sh = new Circle();
		sh.draw(); // cicle의 draw
		
		Circle c = new Circle();
		c.draw();
		c.show();
		
		Square s = new Square();
		s.draw();
	}
}
