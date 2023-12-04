package programmers;

import java.util.*;

class Solution1204 {
    public List solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int n = - 1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != n){
                list.add(arr[i]);
                n = arr[i];
            }
        }
        return list;
    }
}

public class day1204 {
	public static void main(String[] args) {
		Solution1204 s = new Solution1204();
		
		int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
		int[] arr2 = {4, 4, 4, 3, 3};
		
		System.out.println(s.solution(arr1));
		System.out.println(s.solution(arr2));
	}
}
