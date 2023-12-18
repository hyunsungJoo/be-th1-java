package programmers;

class Solution1215 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i =0; i < arr1.length; i++){
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            s = String.format("%" + n + "s", s);
            s = s.replace("1", "#");
            answer[i] = s.replace("0", " ");
        }
        return answer;
    }
}

public class day1215 {
	public static void main(String[] args) {
		Solution1215 s = new Solution1215();
		
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		System.out.println(s.solution(5, arr1, arr2));
	}
}
