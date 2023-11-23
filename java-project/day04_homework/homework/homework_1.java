package homework;

// 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
public class homework_1 {
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		for(int i = 0; i <= 5 ; i++) {
			for(int j = 0; j <=5-i; j++ ) {
				sum += j;
			}
		}
		System.out.println("1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = " + sum);
	}

}
