package programmers;

class Solution1130 {
    public long solution(int a, int b) {
        long answer = 0;
    
        if(b > a){
            for(int i = a; i < b + 1; i++){
                answer += i;
            }
        }
        else
            for(int i = b; i < a + 1; i++){
                answer += i;
            }
        return answer;
    }
}

public class day1130 {
	public static void main(String[] args) {
		
		Solution1130 s = new Solution1130();
		System.out.println(s.solution(3, 5));
		System.out.println(s.solution(3, 3));
		System.out.println(s.solution(5, 3));
	}

}
