package programmers;

import java.util.*;

class Solution1204 {
	public List solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1])
                list.add(arr[i]);
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
