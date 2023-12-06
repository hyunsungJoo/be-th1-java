package day13.IO.generic;

public class GenericEx<T> { // 타입을 정하지 못하였을 때 사용
	
	T[] v; // 멤버변수
	
	public void set(T[] v) {
		this.v = v;
	}
	
	public void print() {
		for (T item : v) {
			System.out.println(item);
		}
	}

}
