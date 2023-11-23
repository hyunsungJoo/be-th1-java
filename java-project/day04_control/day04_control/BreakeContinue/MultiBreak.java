package day04_control.BreakeContinue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean t = true;
		
		first : {
			second : {
				third : {
					
					int k = 100; 
					System.out.println("Before the break"); // 1
					if(t) break second;
					System.out.println("This won't execute"); // 2
				}// third end
				System.out.println("123"); // 3
			} // second end
			System.out.println("This is after second block");// 4
		} // first end
	}
}
