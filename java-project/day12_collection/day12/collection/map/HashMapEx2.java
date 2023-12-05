package day12.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// key / value 한쌍으로 처리. (set + list)
public class HashMapEx2 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("하나", 90);
		map.put("두울", 100);
		map.put("세엣", 50);
		map.put("네엣", 80);
		map.put("다섯", 75);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
//		Set set = (Set)map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); //////
			System.out.println("Name : " + e.getKey() + ", Score : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total / set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최하점수 : " + Collections.min(values));
	}
}
