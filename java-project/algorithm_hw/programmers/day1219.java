package programmers;

class Solution1219 {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long pNum = Long.parseLong(p);
        for(int i = 0; i < t.length() - size + 1; i++){
            String temp = t.substring(i, i + size);
            long num = Long.parseLong(temp);
            if(pNum >= num) answer++;
        }
        return answer;
    }
}

public class day1219 {
	public static void main(String[] args) {
		Solution1219 s = new Solution1219();
		
		String s1 = "3141592";
		String s2 = "271";
		
		System.out.println(s.solution(s1, s2));
	}
}
