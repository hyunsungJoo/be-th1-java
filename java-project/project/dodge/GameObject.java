package dodge;

import java.awt.Color;

import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class GameObject extends JFrame{

    Toolkit imageTool = Toolkit.getDefaultToolkit();
    Image flight_img = imageTool.getImage("src\\img\\ship.jpg");
    Image flight = flight_img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // 사진 크기변경
    
    // 이미지 버퍼
    Image buffImg;
    Graphics buffG;
    
    int x = 100;
    int y = 100;

    public GameObject(){
    	setBackground(Color.white); // 배경색깔 변경
        // 프레임의 대한 설정.
        setTitle("JFrame 테스트"); // 프레임 제목 설정.
        setSize(854,480); // 프레임의 크기 설정.
        setResizable(false); // 프레임의 크기 변경 못하게 설정.
        setVisible(true); // 프레임 보이기;
        setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임의 x버튼 누르면 종료;
        setLocationRelativeTo(null); // 화면 중앙에 frame 띄우기
        

    
        
     // 키 어댑터 ( 키 처리용 )
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                    	if(y < 0) break;
                        y -=5;                      
                        break;
                    case KeyEvent.VK_DOWN:
                    	if(y > 400) break;
                        y +=5;
                        break;
                    case KeyEvent.VK_LEFT:
                    	if(x < 0) break;
                        x -=5;
                        break;
                    case KeyEvent.VK_RIGHT:
                    	if(x > 770) break;
                        x +=5;
                        break;
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
    	 buffImg = createImage(getWidth(),getHeight()); // 버퍼링용 이미지 ( 도화지 )
         buffG = buffImg.getGraphics(); // 버퍼링용 이미지에 그래픽 객체를 얻어야 그릴 수 있다고 한다. ( 붓? )
         update(g);
    }
    
    @Override
    public void update(Graphics g) {
        buffG.clearRect(0, 0, 854, 480); // 백지화
        buffG.drawImage(flight, x, y, this); // 유저 비행기 그리기.
        g.drawImage(buffImg,0,0,this); // 화면g애 버퍼(buffG)에 그려진 이미지(buffImg)옮김. ( 도화지에 이미지를 출력 )
        repaint();
    }
    


	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
    
                

}
