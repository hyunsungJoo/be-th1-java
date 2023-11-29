package programmers;

class Solution1129 {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return x % sum == 0 ? true : false ;
    }
}

public class day1129 {
	public static void main(String[] args) {
		Solution1129 s = new Solution1129(); 
		
		System.out.println(s.solution(10));
		System.out.println(s.solution(12));
		System.out.println(s.solution(11));
		System.out.println(s.solution(13));
	}
}
