package programmers;

public class day1124 {
	public static void main(String[] args) {
	
		int[] num_list = {1, 2, 3, 4, 5};
		int[] answer = new int[num_list.length];
		
		for(int i =0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length - i - 1];
            System.out.println(answer[i]);
        }			
	}

}
