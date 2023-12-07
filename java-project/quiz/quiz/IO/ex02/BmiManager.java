package quiz.IO.ex02;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import quiz.collection.map.Video;

public class BmiManager extends Bmi{
	
	public List add(List list) {
		Bmi b = new Bmi();
		b.input();
		list.add(b);
		return list;
	}
	
	public List delete(List list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 리스트의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		list.remove(num);
		return list;
	}
	
	public List edit(List list) {
		Scanner sc = new Scanner(System.in);
		Bmi b = new Bmi();
		System.out.print("수정할 비디오의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		b.input();
		list.set(num, b);
		return list;
	}

}
