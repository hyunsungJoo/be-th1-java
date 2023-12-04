package programmers;

class Solution1201 {
    public int solution(String s) {
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] eng = {"zero", "one", "two", "three", "four", 
        				"five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < 10; i++){
            s = s.replace(eng[i], num[i]);
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}

public class day1201 {
	public static void main(String[] args) {
		Solution1201 s = new Solution1201();
		
		System.out.println(s.solution("one4seveneight"));
		System.out.println(s.solution("23four5six7"));
		System.out.println(s.solution("2three45sixseven"));
		System.out.println(s.solution("123"));
	}
}
