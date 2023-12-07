package day14_io.file_Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception { // 예외처리 위임
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("test.txt");
		
		// 쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("C:\\Intel\\tt.txt");
		
		byte[] buffer = new byte[1024 * 8];
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read(); // buffer 크기만큼 읽어들임
			if(inputData == -1) break;
			os.write(buffer, 0, inputData);
		} // while end
		long end = System.currentTimeMillis();
		
		System.out.println(end - start); // 복사(작업)에 걸린 시간
		is.close();
		os.close();
		System.out.println("copy success!!");
	}
}
