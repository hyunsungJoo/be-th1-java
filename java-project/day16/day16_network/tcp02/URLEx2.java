package day16_network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws IOException {

		URL url = new URL("");
		
		// URL 이 갖고 있는 함수들 사용
		System.out.println("프로토콜 : + " + url.getProtocol());
		System.out.println("호스트와 포트 : + " + url.getAuthority());
		System.out.println("호스트 : + " + url.getHost());
		System.out.println("포트 : + " + url.getPort());
		System.out.println("경로 : + " + url.getPath());
		System.out.println("질의 : + " + url.getQuery());
		System.out.println("파일명 : + " + url.getFile());
		System.out.println("참조 : + " + url.getRef());
	}
}
