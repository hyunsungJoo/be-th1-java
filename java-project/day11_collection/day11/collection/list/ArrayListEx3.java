package day11.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(3);
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
//		list2.add(200);
		print(list, list2);
		
		list.sort(null); // 오름차순 정렬
		Collections.sort(list2); // 오름차순 정렬
		print(list, list2);
		
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2)); // true 모두 포함되어있는지 확인
		list2.add("B");
		list2.add("C");
		print(list, list2);
		
		list2.set(3, "김연아"); // 3번째 요소 교체
		print(list, list2);
		
	}

	public static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
