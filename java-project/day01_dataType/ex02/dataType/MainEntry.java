
package ex02.dataType;
 
public class MainEntry {
	public static void main(String[] args) { 
		
		int su = 9;
		char ch = 'A';
		String str = "korea";
		double d = 12.34;
		float f = 12.34f;
		long num = 9L;
		
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d);
		System.out.println(f);
		
		System.out.println(su + "," + ch + "," + str);
		System.out.println("su = " + su);
		
		System.out.println();
		
		int su2; // 지역변수는 반드시 초기화하고 사용한다.
		// System.out.println(su2); 에러
		
		int x = 2; // 기본자료형
		Integer y = 2; // 참조형
		x = y; // 자동 형변환 5버전 이후부터 자동형변환 됨.
		
		String str3 = "A"; // A\0 String타입은 항상 맨 마지막에 null을 달고다님 
		char ch3 = 'A'; // A
	} 
}


// 한줄주석

/*
	여러줄주석
*/

// crtl + / 해당 줄 주석, crtl + shift + / 해당 여러줄 주석