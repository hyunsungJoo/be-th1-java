package programmers;

import java.util.*;

class Solution1208 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            count += d[i];
            if(count <= budget) answer++; 
        }
        return answer;
    }
}

public class day1208 {
	public static void main(String[] args) {
		Solution1208 s = new Solution1208();
		int[] arr1 = {1, 3, 2, 5, 4};
		int[] arr2 = {2, 2, 3, 3};
		
		System.out.println(s.solution(arr1, 9));
		System.out.println(s.solution(arr1, 10));
	}
}
