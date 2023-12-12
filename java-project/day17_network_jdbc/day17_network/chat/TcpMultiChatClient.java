package day17_network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("USAGE : java TcpMultichatClient 대화명이 없습니다.");
			System.exit(0);
		}
		
		try {
			String ip = "192.168.0.13";
			Socket s = new Socket(ip, 7777);
			System.out.println("서버에 연결 되었습니다.");
			Thread sender = new Thread(new ClientSender(s, args[0]));
			Thread reciver = new Thread(new ClientReciver(s));
			
			sender.start();
			reciver.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main() end
	
	static class ClientSender extends Thread {
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) {
			this.s = s;
			
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in); // 키보드로부터 입력받기
			try {
				if(dos != null) dos.writeUTF(name);
				while(dos != null) dos.writeUTF("[" + name + "] " + sc.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}// ClientSender class end
	
	static class ClientReciver extends Thread { // inner class
		Socket s;
		DataInputStream dis;
		
		public ClientReciver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while(dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	 
		}
	}
}


