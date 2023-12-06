package day12.util.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		list.addFirst("a"); // 맨앞에 넣어줘
		list.addLast("z"); // 마지막에 넣어줘
		System.out.println(list);
		
		//list.remove(); // 처음꺼 지워줌
		
		list.remove("k"); // reomove("data value");
		System.out.println(list);
		
		list.remove(2); // remove(index number);
		System.out.println(list);
		
		list.removeFirst(); // 첫번째꺼 지워줘
		System.out.println(list);
		
		list.removeLast(); // 마지막꺼 지워줘 
		System.out.println(list); // [c, o, p, x]
		
		list.set(2,"a"); // 2번index를 a로 교체 
		System.out.println(list); // [c, o, a, x]
		
		list.set(3,list.get(1)+"change"); //3번index 교체
		System.out.println(list); // [c, o, a, ochange]
		
		String str1 = (String)list.peek(); // 맨앞 데이터 꺼내줘
		System.out.println("=====================");
		System.out.println(str1); // list의 0번index // c
		System.out.println(list); // peek해도 변하지 않음  // [c, o, a, ochange]
		
		String str2 = (String)list.poll(); // 맨앞 데이터 꺼내줘
		System.out.println(str2); // list의 0번index // c
		System.out.println(list); // poll한 데이터값 지워짐 // [o, a, ochange]
		
		list.offer("a"); // list 맨 마지막에 "a"넣어줌
		System.out.println(list);
		
		String str3 = (String)list.remove(); // 맨앞요소 꺼내고 지워줌, poll과 같음
		System.out.println(str3); // 맨앞요소 나옴
		System.out.println(list); // 맨앞요소 지워짐
	}
}

