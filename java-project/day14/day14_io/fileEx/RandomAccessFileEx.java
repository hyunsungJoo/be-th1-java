package day14_io.fileEx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx { // 읽기쓰기 다 됨
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw"); // 읽고 쓰게 가능
		
		for (int i = 0; i <= 10; i++) {
			raf.seek(i * 200); // 예외발생, 원하는 위치지정
			String str = "hello";
			raf.writeUTF(str + i);
//			raf.writeInt(i);
		}
		
		System.out.println("string print success!");
		raf.close();
	}

}
