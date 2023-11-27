package programmers;

import java.util.*;

public class day1127 {
	public static int solution(int[][] sizes) {
		
		int max = 0;
	    int min = 0;
	        
	    for(int i = 0; i < sizes.length; i++){
	    	int a = Math.max(sizes[i][0], sizes[i][1]);
	        int b = Math.min(sizes[i][0], sizes[i][1]);
	            
	        max = Math.max(max, a);
	        min = Math.max(min, b); 
	    }
	    return max * min;
	}    
	    
	public static void main(String[] args) {
		int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(a));
	}
}
