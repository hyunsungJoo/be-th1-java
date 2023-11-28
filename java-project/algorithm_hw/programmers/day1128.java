package programmers;

class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(i + j <= k) answer += board[i][j];    
            }
        }
        return answer;
    }
}

public class day1128 {
	public static void main(String[] args) {
		int [][] a = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
		int k = 2;
		
		Solution s = new Solution();
	
		System.out.println(s.solution(a,2));
	}

}
