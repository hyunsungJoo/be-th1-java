package quiz.IO.ex02;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
	
		BmiManager bm = new BmiManager();
		List<Bmi> list = new ArrayList<>();
		
		RandomAccessFile raf = new RandomAccessFile("bmi.txt", "rw");
		
		while(true) {
			System.out.print("번호를 입력하세요(1.추가, 2.삭제, 3.수정, 4.종료) :");
			int num = sc.nextInt();
			switch(num) {
			case 1: bm.add(list); break;
			case 2 : 
				try{
					bm.delete(list); break;
				}
				catch(Exception e) {
					System.out.println("내용이 존재하지 않습니다.");
				}
			case 3 :
				try {
				bm.edit(list); break;
				}
				catch(Exception e) {
					System.out.println("내용이 존재하지 않습니다.");
				}
			case 4 : break;
			}
			System.out.println();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i)); 
			}
			System.out.println();
		}
		
		for (int i = 0; i <= list.size(); i++) {
			raf.seek(i * 200); // 예외발생, 원하는 위치지정
			raf.write();
//			raf.writeInt(i);
		}
		
		System.out.println("string print success!");
		raf.close();
		
	}
}
