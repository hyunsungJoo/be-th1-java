package day11.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("dZZZZZ");
		set.add("dzzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set); // 우선순위 : 영문자/ 대>소>숫자>한글(그 외 나라 언어들)
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result : " +  set.subSet(from, to)); // a,d (d 미포함)
		System.out.println("result : " + set.subSet(from, to + "zzz")); // d 나오게 하려면 
		
		
	}

}
