package day11.collection.set;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(); // TreeSet<Type>
		
		int[] score = {85, 95, 35, 45, 65, 40, 100};
		
		for(int i = 0; i < score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set); // 자동정렬한다.
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50))); // 50보다 작은 값 : [35, 40, 45] 출력
		System.out.println("50보다 큰 값 : " + set.tailSet(50)); // 50보다 큰 값 : [65, 85, 95, 100] 출력
		
		System.out.println(set.first()); // 35 출력
		System.out.println(set.last()); // 100 출력
	}

}
