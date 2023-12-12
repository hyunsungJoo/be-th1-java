package day13.IO.ex01;

public class KeyInput {
	public static void main(String[] args) throws Exception{ // 예외처리 JVM한테 위임
		
		int su1 = 0;
		
		System.out.println("데이터 입력 끝은 Ctrl + Z 누르세요.");
		
		while((su1 = System.in.read()) != -1) {
//			System.out.print(su1 + "\t");
			System.out.print((char)su1 + "\t");
		}
		System.out.println();
	}

}
