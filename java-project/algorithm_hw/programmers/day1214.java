package programmers;

import java.util.*;

class Solution1214 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}

public class day1214 {
	public static void main(String[] args) {
		Solution1214 s = new Solution1214();
		
		String[] s1 = {"sun", "bed", "car"};
		String[] s2 = {"abce", "abcd", "cdx"};
		
		System.out.println(s.solution(s1, 1));
		System.out.println(s.solution(s2, 2));
	}
}
