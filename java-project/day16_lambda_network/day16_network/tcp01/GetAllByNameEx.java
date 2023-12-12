package day16_network.tcp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class GetAllByNameEx {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strUrl = null;
		InetAddress[] address;
		
		System.out.println("site address = ");
		try {
			strUrl = br.readLine();
			address = InetAddress.getAllByName(strUrl); // 예외발생
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
