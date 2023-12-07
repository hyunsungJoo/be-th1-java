package programmers;

class Solution1207 {
    public int solution(int number, int limit, int power) {
    	int answer = 0;
        int[] count = new int[number+1];
        
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number / i; j++){
                count[i * j]++;
            }
        }
        for(int i = 1; i <= number; i++){
            answer += (count[i] <= limit) ? count[i] : power;
        }
        return answer;
    }
}


public class day1207 {
	public static void main(String[] args) {
		Solution1207 s = new Solution1207();
		
		System.out.println(s.solution(5, 3, 2));
		System.out.println(s.solution(10, 3, 2));
	}
}
