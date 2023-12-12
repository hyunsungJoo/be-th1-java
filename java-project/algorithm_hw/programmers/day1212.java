package programmers;

import java.util.Arrays;

class Solution1212 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        if(n > m){
            int temp = n;
            n = m;
            m = temp;
        }
        
        for(int i = 1; i <= m; i++){
            if(n % i == 0 && m % i == 0){
                answer[0] = i;
            }
        }
        
        for(int i = m; i <= n * m; i++){
            if(i % n == 0 && i % m == 0){
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}

public class day1212 {
	public static void main(String[] args) {
		Solution1212 s = new Solution1212();
		
		int[] answer1 = s.solution(3, 12);
		int[] answer2 = s.solution(2, 5);
		
		System.out.println(Arrays.toString(answer1));
		System.out.println(Arrays.toString(answer2));
	}
}
