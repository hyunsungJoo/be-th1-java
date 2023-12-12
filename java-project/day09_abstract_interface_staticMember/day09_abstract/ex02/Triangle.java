package day09_abstract.ex02;

public class Triangle extends Shape{
	int h = 10;
	
	@Override
	public double calc(double x) {
		result = (x * h) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(10);
		System.out.println(result + " 넓이의 " + name + "이 그려졌습니다.");
	}
}
