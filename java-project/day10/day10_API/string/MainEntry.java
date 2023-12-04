package day10_API.string;

class Point{}

public class MainEntry {
	public static void main(String[] args) {
	
		String str = "abc";
		System.out.println("str : " + str);
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2)); // c
		
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println("kbs");
		
		String msg = "aslksdjlfskj1234";
		System.out.println("en-core " + msg);
		System.out.println(msg);
		
		String str2 = "abcd".substring(2); // 2번부터 다 출력 cd
		System.out.println(str2);
		
		str2 = "abcdefhijklmn".substring(2, 5); // 2번부터 4번까지 출력
		System.out.println(str2);
		
		System.out.println(msg + " : " + str2);
		
		String s1 = new String("encore");
		String s2 = new String("encore");
		System.out.println("s1.hasecode() : " + s1.hashCode()); // String은 같은 문자열을 가지면 같은 hashCode을 가짐
		System.out.println("s2.hasecode() : " + s2.hashCode());
		
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println("p1.hasecode() : " + p1.hashCode());
		System.out.println("p2.hasecode() : " + p2.hashCode());
		
		String s3 = "seoul";
		String s4 = "seoul";
		if(s3 == s4) System.out.println("same");
		else System.out.println("not same");
		System.out.println("---------------------------");
		if(s1 == s2) System.out.println("same");
		else System.out.println("not same");
		System.out.println("---------------------------");
		
		s2 = "kosa";
		System.out.println("s1.hasecode() : " + s1.hashCode());
		System.out.println("s2.hasecode() : " + s2.hashCode());
		
		s2 = "korea";
		System.out.println("s1.hasecode() : " + s1.hashCode()); 
		System.out.println("s2.hasecode() : " + s2.hashCode());
		
		s2 = "encore";
		System.out.println("s1.hasecode() : " + s1.hashCode());
		System.out.println("s2.hasecode() : " + s2.hashCode());
		
	}
}
