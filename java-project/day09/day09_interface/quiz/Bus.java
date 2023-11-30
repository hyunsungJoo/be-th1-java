package day09_interface.quiz;

public class Bus implements Trans {
	String go = "";
	String no = "";
	@Override
	public String stop(String y) {
		no = y;
		return no;
	}
	@Override
	public String start(String x) {
		go = x;
		return go;
	}
	@Override
	public void show(String wow) {
		start("부릉부릉!!!");
		stop("끽!!!");
		System.out.println(wow + "의 출발은 " + go + "정지는 " + no);
	}
}
