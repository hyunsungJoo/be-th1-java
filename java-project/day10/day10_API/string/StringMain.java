package day10_API.string;

public class StringMain {
	public static void main(String[] args) {
		String s1 = "happydoyeon";
		String s2 = "SEOUL";
		
		System.out.println("s1 = " + s1 + " s2 = " + s2);
		System.out.println(s1.concat(s2)); //문자열 결합
		System.out.println(s1 + s2);
		System.out.println(s2.replace("EO", "korea")); // EO를 korea로 변경
//		s2 = s2.replace("EO", "korea");
//		System.out.println("s1 = " + s1 + " s2 = " + s2);
		
		String s3 = new String("     ab     cd     ");
		System.out.println(s3);
		System.out.println("length = " + s3.length()); // 19 문자열 길이
		s3 = s3.trim(); // 양쪽 공백제거
		System.out.println(s3);
		System.out.println("length = " + s3.length()); // 9
		
//		String s4 = new String("abc defgh k2344 keijk 234098091824");
		String s4 = new String("abc/defgh/k2344/keijk/234098091824");
//		String[] s5 = s4.split(" "); // 공백으로 끊어서 s5배열에 넣음
		String[] s5 = s4.split("/"); // /로 끊어서 s5배열에 넣음
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);
		}
		
		String s6 = "123-4567-8907";
		s5 = s6.split("-");
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);
		}
		
		String s7 = "1234567890abcdef    34567    78f88f8  string";
		char ch = s7.charAt(15);
		System.out.println(ch);
		System.out.println(s7.indexOf('f')); // 15 가장 처음 나오는 f가 몇번째있는지 찾아줌
		System.out.println(s7.lastIndexOf('f')); //가장 뒤에 있는 f 몇번째인지 찾아줌
		
		System.out.println(s7.substring(3)); // 3번 인덱스부터 끝까지 출력
		System.out.println(s7.substring(5, 7));
		
		System.out.println(s2 + " 소문자 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println(s1 + " 대문자 출력 toUpperCase() : " + s3.toUpperCase());
		
		
	}
}
