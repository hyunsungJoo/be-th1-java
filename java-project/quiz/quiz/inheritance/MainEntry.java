package quiz.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("정규직***********************");
		Regular r = new Regular();
		System.out.println();
		r.print();
		
		System.out.println();
		
		System.out.println("알바************************");
		PartTime p = new PartTime();
		System.out.println();
		p.print();
		
		System.out.println();
		
		System.out.println("Sales*******************");
		Sales s = new Sales();
		System.out.println();
		s.print();
	}

}
