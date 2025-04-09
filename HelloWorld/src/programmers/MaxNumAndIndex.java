package programmers;

public class MaxNumAndIndex {

	public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int indexOfMax = 0;
        
        for(int i = 0; i < array.length; i++) {
        	if(array[i] > max) {
        		max = array[i];
        		indexOfMax = i;
        	}
        }
        answer[0] = max;
        answer[1] = indexOfMax;
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
	
	public static void main(String[] args) {
		int[] array = new int[] {1,8,3,2};
		solution(array);

	}

}
