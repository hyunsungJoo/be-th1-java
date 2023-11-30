package day09_abstract.ex02;

public class Rectangle extends Shape{
	int y = 10;

	@Override
	public double calc(double x) {
		result = x * y;
		return result;
	}

	@Override
	public void show(String name) {
		calc(10);
		System.out.println(result + " 넓이의 " + name + "이 그려졌습니다.");
	}
}
