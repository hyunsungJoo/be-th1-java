package day07_oop.quiz;

public class MainEntry {
	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.display();
		t.setColor("red");
		t.setChannel(30);
		t.display();
		
		Tv t2 = new Tv("blue", 7);
		t2.display();
		
	}

}
