package quiz.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Video v = new Video();
		Map<Integer, Video> map = new HashMap<>();
		int num = 0;
		
		while(num !=4) {
			System.out.print("번호를 입력하세요(1.추가, 2.삭제, 3.수정, 4.종료) :");
			num = sc.nextInt();
			switch(num) {
			case 1: v.add(map); break;
			case 2 : 
				try{
					v.delete(map); break;
				}
				catch(Exception e) {
					System.out.println("삭제할 비디오의 번호를 입력해주세요.");
				}
			case 3 :
				try {
				v.edit(map); break;
				}
				catch(Exception e) {
					System.out.println("수정할 비디오의 번호를 입력해주세요.");
				}
			case 4 : break;
			}
			System.out.println();
			v.print(map);
			System.out.println();
		}
	}
}
