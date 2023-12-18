package programmers;

class Solution1218 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for(int i = 1; i <= count; i++){
            sum += price * i;
        } 
        answer = (sum-money < 0) ? 0: sum - money;
        return answer;
    }
}

public class day1218 {
	public static void main(String[] args) {
		Solution1218 s = new Solution1218();
		
		System.out.println(s.solution(3, 20, 4));
	}
}
