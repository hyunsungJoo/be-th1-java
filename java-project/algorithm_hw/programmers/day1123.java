package programmers;

import java.util.Scanner;

public class day1123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++){
            if(num % i == 0) sum += i;
        }
		
		System.out.println(num + "의 약수의 합은 " + sum + " 입니다.");
		
	}

}



