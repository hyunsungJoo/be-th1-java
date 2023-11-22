package day02_Input;

// 패키지 임포트 : import
import java.util. *;

public class MainEntry {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("integer data input : ");
		int su = sc.nextInt();
		
		System.out.print("name input : ");
		//String space = sc.nextLine();
		//String name = sc.nextLine();
		String name = sc.next();
		
		System.out.println(su + ", name : " + name);
		
	}

}
