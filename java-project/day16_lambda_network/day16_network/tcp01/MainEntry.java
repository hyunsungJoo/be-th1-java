package day16_network.tcp01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {
	public static void main(String[] args) {
		
//		String host = "127.0.0.1"; 
		String host = "192.168.0.13";
		
		// 주소를 얻어옴
		try {
			InetAddress[] adress = InetAddress.getAllByName(host);
			
			for (InetAddress item : adress) {
				System.out.println(item);
				System.out.println(item.getHostName());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}	
	}
}
