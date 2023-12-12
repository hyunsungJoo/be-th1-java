package day09_interface.quiz;

public class MainEntry {
	public static void main(String[] args) {
		
		Bus b = new Bus();
		Subway s = new Subway();
		
		b.show("버스");
		s.show("지하철");
	}

}
