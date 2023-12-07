package day14_io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInformation {
	public static void main(String[] args) throws IOException {
		File file = null;
		
		byte[] fileName = new byte[100];
		String strName;
		System.out.println("file name = "); // 상대경로 - memo.txt 
							// 절대경로 - C:\한화 BEYOND SW 캠프 1기\5_Java\th1_java 수업 정리.txt
		
		System.in.read(fileName); // 예외발생
		strName = new String(fileName).trim(); // 위에서 읽어낸 파일 이름 문자열 변환
		
		file  = new File(strName);
		
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("표준경로 : " + file.getCanonicalPath());
		System.out.println("최종 수정일 : " + new Date(file.lastModified()));
		System.out.println("파일크기 : " + file.length());
		System.out.println("읽기속성 : " + file.canRead());
		System.out.println("쓰기속성 : " + file.canWrite());
		System.out.println("파일경로 : " + file.getPath());
		System.out.println("숨김경로 : " + file.isHidden());	
	}
}
