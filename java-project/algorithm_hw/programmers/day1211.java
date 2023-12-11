package programmers;

class Solution1211 {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = (char)(c + n);
                if(c > 'z') c -= 26;
                answer += c;
            }
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c + n );
                if(c > 'Z') c-= 26;
                answer += c;
            }
            if(c == ' ') answer += c;
        }
        return answer;
    }
}

public class day1211 {
	public static void main(String[] args) {
		Solution1211 s = new Solution1211();
		
		String s1 = "AB";
		String s2 = "z";
		String s3 = "a B z";
		
		System.out.println(s.solution(s1, 1));
		System.out.println(s.solution(s2, 1));
		System.out.println(s.solution(s3, 4));
	}
}
