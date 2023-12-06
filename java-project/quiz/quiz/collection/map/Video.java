package quiz.collection.map;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Video {
	
	String title, category, lendName;
	String lend;
	Date lendDate = new Date();
	int num = 0;
	int lend_num = 0;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제목을 입력하세요 : ");
		title = sc.next();
		System.out.print("장르를 입력하세요 : ");
		category = sc.next();
		
		while(lend_num != 1 && lend_num != 2) {
		System.out.print("대여여부을 입력하세요(1 입력시 대여중, 2 입력시 대여가능) : ");
		lend_num = sc.nextInt();
			if(lend_num == 1) lend = "대여중";
			else lend = "대여가능";
		}
		
		if(lend == "대여중") {
			System.out.print("대여자이름을 입력하세요 : ");
			lendName = sc.next();
		}else {
			lendName = "대여자없음";
		}
	}
	
		
	public Map add(Map map) {
		Video v = new Video();
		v.input();
		map.put(num, v);
		num++;
		return map;
	}
	
	public Map delete(Map map) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 비디오의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		map.remove(num);
		return map;
	}
	
	public Map edit(Map map) {
		Scanner sc = new Scanner(System.in);
		Video v = new Video();
		System.out.print("수정할 비디오의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		v.input();
		map.replace(num, v);
		return map;
	}
	
	public void print(Map map) {
		Set set = map.entrySet();
		Iterator it = set.iterator();
			
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); //////
			System.out.println("비디오번호 : " + e.getKey() + ", 비디오 : " + e.getValue());
		}
	}

	@Override
	public String toString() {
		return "[제목 : " + title + ", 장르 : " + category + ", 대여자이름 : " + lendName + ", 대여여부 : " + lend
				+ ", 대여시간 : " + lendDate + "]";
	}
	
	
	
}
