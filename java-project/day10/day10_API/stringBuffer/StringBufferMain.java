package day10_API.stringBuffer;

public class StringBufferMain {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");
		System.out.println(sb); // 문자열 뒤에 추가
		
		sb.insert(7, " my"); // 7번째에 " my" 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // 8번째부터 10번재 전까지를 your로 변경
		System.out.println(sb);
		
		System.out.println(sb.reverse()); // 문자열 역으로 출력
		System.out.println(sb.length()); // 19
		
		sb.setLength(5); // 5번째까지 잘러줌
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
