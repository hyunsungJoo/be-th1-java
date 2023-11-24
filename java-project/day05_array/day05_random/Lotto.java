package day05_random;import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		
		  int[] lotto = new int[6];
		  
		  for(int i = 0; i < lotto.length; i++){
		  		lotto[i] = (int)(Math.random() * 45) + 1;
		  		
		  		for(int j = 0; j < i; j++){
		  			if(lotto[i] == lotto[j]) i--;
		  		}
		  }
		  
		  System.out.println("로또 당첨 번호는 ");
		  
		  for(int i = 0; i < lotto.length; i++) {
			  System.out.print(lotto[i] + " ");
		  }
	}
}
