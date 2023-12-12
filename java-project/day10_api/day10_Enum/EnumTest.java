package day10_Enum;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WENDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch(day) {
		case MONDAY : 
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY : 
			System.out.println("Friday are better.");
			break;
		case SATURDAY : 
			System.out.println("Weekends are best.");
			break;
		default : 
			System.out.println("Midweek days are best.");
			break;
		}
	}
	
	
}
