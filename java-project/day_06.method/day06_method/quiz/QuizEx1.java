package day06_method.quiz;

public class QuizEx1 {
	
	public static void info() {
		String name = "김김김";
		String p_num = "010-1111-1111";
		String adress = "서울";
		System.out.println("이름 : " + name + " 전화번호 : " + p_num + " 주소 : " + adress);
	}
	
	public static void abs(int x) {
		if(x < 0) System.out.println(-x);
		else System.out.println(x);
	}
	
	public static void max(int x, int y) {
		if(x > y) System.out.println(x);
		else System.out.println(y);
	}
	
	public static void main(String[] args) {
		info();
		abs(-2);
		max(2,3);
	}
}
