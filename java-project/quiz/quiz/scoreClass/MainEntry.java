package quiz.scoreClass;

public class MainEntry {
	public static void main(String[] args) {
		
		Score s = new Score();
		System.out.println();
		s.print_score();
		
		System.out.println();
		s.setName("김하나");
		s.setKor(90);
		s.setEng(90);
		s.setCom(90);
		
		s.print_score();
		System.out.println();
		
		Score s2 = new Score("김두울");
		System.out.println();
		s2.print_score();
		
		System.out.println();
		Score s3 = new Score("김세엣", 30, 30, 30);
		s3.print_score();
	}
}
