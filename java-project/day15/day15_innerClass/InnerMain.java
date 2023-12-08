// 방법 3
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerMain { // Outer class
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)만들어주는 클래스
		Button btn = new Button("Button - Start"); // 버튼 만들어주는 클래스
		
		//2.
		// 버튼이 클릭되었을 때 수행할 작업을 정의하기 위해 ActionListener를 등록
		btn.addActionListener(new ActionListener() { // 익명(무명) 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했습니다.");
				System.out.println(e.getActionCommand()); // 누가 눌렷는지 나옴.
				System.out.println(e.getSource()); // 소스 확인
				System.out.println();
			}
		}); // 버튼에 액션이벤트 추가
		
		// addWindowListener 메서드는 프레임의 윈도우 이벤트를 처리하는 데 사용
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) { // 닫을때 어떻게 할지 정하는 메서드
				System.exit(0);
			}
		});
		
		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true); // 화면 보여주기, false로 하면 화면 안나옴.
		frame.setSize(300,200); // 프레임(화면) 크기 - 너비, 높이
		frame.setLocation(300, 150); // 윈도우 창 어디에 띄울건지 위치 지정, 모니터에서는 왼쪽 상단이 (0,0)
	}
}



/* 방법2
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain { // Outer class
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - Start");
		
		//2.
		btn.addActionListener(new ActionListener() { // 익명(무명) 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했습니다.");
				System.out.println(e.getActionCommand()); // 누가 눌렷는지 나옴.
				System.out.println(e.getSource());
				System.out.println();
			}
		}); // 버튼에 액션이벤트 추가
	
		
		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(300, 150);
	}
}
*/

/* 방법 1
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain { // Outer class
	
	class EventHandler implements ActionListener { // Inner Class

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent 발생했습니다.");
			System.out.println(e.getActionCommand()); // 누가 눌렷는지 나옴.
			System.out.println(e.getSource());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - Start");
		
		//1.
		EventHandler handler = new InnerMain().new EventHandler();
		btn.addActionListener(handler); // 버튼에 액션이벤트 추가(버늩누르면 console에 글씨나옴)
		
		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(300, 150);
	}
}
*/