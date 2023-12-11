package day16_network.tcp03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest { // Socket 1개 필요
	public static void main(String[] args) {
		
		Socket s = null;
		
		
		// I / O
		try {
//			s = new Socket("192.168.0.13", 9000); //  "192.168.0.13"
			s = new Socket("127.0.0.1", 9000);
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
			String str = "안녕하세요.....Server님!!!";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { s.close(); } catch(IOException e) { e.printStackTrace();}
		}	
	}
}
