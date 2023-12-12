package day09_interface.ex02;

public class MainEntry {
	public static void main(String[] args) {
		
		BB b = new BB();
		b.draw();
		b.show();
		
		IDraw bb = new BB();
		bb.draw();
	}

}
