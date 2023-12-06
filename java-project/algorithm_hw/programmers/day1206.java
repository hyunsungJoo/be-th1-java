package programmers;

class Solution1206 {
    public String solution(String s) {
        String answer = "";
        String[] n = s.split("");
        int num = 0;
        
        for(int i = 0; i < n.length; i++){
            if(n[i].equals(" ")){
                num = -1;
            }
            answer += (num % 2 == 0) ? n[i].toUpperCase() : n[i].toLowerCase();
            num++;
            }
        return answer;
    }
}

public class day1206 {
	public static void main(String[] args) {
		Solution1206 s = new Solution1206();
		
		String s1 = "try hello world";
		
		System.out.println(s.solution(s1));
	}
}
