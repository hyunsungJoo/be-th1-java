package day09_abstract.quiz;

public class MainEntry {
	public static void main(String args[]) {
		
		Subway s = new Subway();
		s.start();
		s.stop();
		
		System.out.println();
		
		Bus b = new Bus();
		b.start();
		b.stop();
	}
}
