package day10_API.stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(); // 초기 용량 16
		
		System.out.println(sb.hashCode());
		
		System.out.println("length     /     capacity");
		System.out.println(sb.length() +"   /   " + sb.capacity());
		System.out.println("------------------------");
		
		sb.append("encore");
		System.out.println(sb.length() +"   /   " + sb.capacity());
		System.out.println("------------------------");
		
		sb.append("123455667777");
		System.out.println(sb.length() +"   /   " + sb.capacity());
		System.out.println("------------------------");
		
		sb.append("123455667777 3243248023498049328");
		System.out.println(sb.length() +"   /   " + sb.capacity());
		System.out.println("------------------------");
		
		sb.trimToSize(); // 메모리 공간 사이즈에 맞게 재조정
		System.out.println(sb.length() +"   /   " + sb.capacity());
		System.out.println("------------------------");
		
		System.out.println(sb.hashCode());
	}

}
