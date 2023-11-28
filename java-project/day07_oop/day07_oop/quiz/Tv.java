package day07_oop.quiz;

public class Tv {
	
	private String color;
	private int channel;
	
	public Tv() {
		color = "gray";
		channel = 11;
	}
	
	public Tv(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void display() {
		System.out.println("티비의 색상은 " + color + "이고 채널은 " + channel + "번 입니다.");
	}
	
	
}
