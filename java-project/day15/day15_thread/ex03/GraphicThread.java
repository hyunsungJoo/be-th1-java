package day15_thread.ex03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable { // Frame : window창 만들어줌

	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) { // 생성자함수 - 초기화
		this.num = num;
		color = Color.red; // 색 설정
		random = new Random();
		setSize(500, 400); // 프레임(화면) 크기 - 너비, 높이
		setVisible(true); // 화면 보여주기, false로 하면 화면 안나옴.
		setLocation(300, 150); // 윈도우 창 어디에 띄울건지 위치 지정, 모니터에서는 왼쪽 상단이 (0,0)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기
	}
	
	@Override
	public void paint(Graphics g) { // Graphics클래스는 도형을 그릴수 있는 다양한 메소드가 제공됨.
		g.setColor(color); // 색을 정함
		g.fillRect(x, y, 3, 3); // 사각형 그려줌
//		g.fillOval(x, y, 10, 10); // 타원형 그려줌
	}

	@Override
	public void run() {
		Rectangle rect = getBounds(); // Rectangle 객체 생성
		
		for(int i =0; i < num; i++){ // num수 만큼 랜덤으로 그림을 찍어줌
			x = random.nextInt(rect.width); // Random 클래스를 사용하여 주어진 사각형의 폭을 범위 내에서 무작위 정수 값을 생성
			y = random.nextInt(rect.height); // Random 클래스를 사용하여 주어진 사각형의 높이를 범위 내에서 무작위 정수 값을 생성
			
			repaint(); // 그림그리는거 멈추지 않고 paint메소드 불러주는 메서드, 다시 그리도록 요청하는 역할
		
			try {
				Thread.sleep(1000); // 1초 쉬면서 그림을 그려줌
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//1. 
//		GraphicThread gt = new GraphicThread(100);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
		//2.
		new Thread(new GraphicThread(200)).start(); // 200개를 그려줌.
	}
}
