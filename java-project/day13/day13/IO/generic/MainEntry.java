package day13.IO.generic;

import java.util.Date;

class Point{}

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<>();
		
		String[] str = {"abc", "kbs", "dirotor"};
		t1.set(str);
		t1.print();
		System.out.println("======================");
		
		GenericEx<Integer> t2 = new GenericEx<>();
		
		Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8};
		t2.set(num);
		t2.print();
		System.out.println("======================");
		
		GenericEx<Double> t3 = new GenericEx<>();
		
		Double[] d = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
		t3.set(d);
		t3.print();
		System.out.println("======================");
		
		GenericEx<Object> t4 = new GenericEx<Object>(); // 아무 타입이나 받을 수 있음
		Object[] obj  = {"12,45", 2, new Date(), 47.2, 5.5, "text", new Point()};
		t4.set(obj);
		t4.print();
	}
}

