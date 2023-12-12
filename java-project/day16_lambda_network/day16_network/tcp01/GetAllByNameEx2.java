package day16_network.tcp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx2 {
	public static void main(String[] args) throws UnknownHostException { // 예외처리 위임
		
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP 주소 : " + address.getHostAddress());
		System.out.println("=========================");
		
		address = InetAddress.getByName("www.en-core.com");	
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP 주소 : " + address.getHostAddress());
		System.out.println("=========================");
		
		byte[] addr = new byte[4];
		addr[0] = (byte)192;
		addr[0] = (byte)168;
		addr[0] = (byte)0;
		addr[0] = (byte)148;
		
		address = InetAddress.getByAddress(addr);
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP 주소 : " + address.getCanonicalHostName());
		System.out.println("로컬 호스트 IP 주소 : " + address.getHostAddress());
		System.out.println("=========================");
		
		InetAddress[] arr = InetAddress.getAllByName("www.google.com");
//		InetAddress[] arr = InetAddress.getAllByName("www.google.com");
		
		for (InetAddress item : arr) {
			System.out.println("로컬 호스트 이름 : " + item.getHostName());
			System.out.println("로컬 호스트 IP 주소 : " + address.getHostAddress());
		}
	}
}
