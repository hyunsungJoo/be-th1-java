package day04_control.While;

//전체 구구단
public class DoWhileGuGuDan {
	public static void main(String[] args) {
		int num = 1;
		int mul = 1;
		int result = 0;
		
		do {
			num= 1;
			do {
				result = num * mul;
				System.out.print(num + "*" + mul + " = " + result  + "  ");
				num++;
			}while(num <= 9);
			System.out.println();
			mul++;
		} while(mul <= 9);
			
	}

}
