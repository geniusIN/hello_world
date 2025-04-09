package programmers;

public class Collatz {

	public static int solution(int num) {
        int answer = 0;
        int count = 0;
        
        while(num != 1 && count <= 500) {
        	if(num%2 ==0) {
        		num = num/2;
        	} else {
        		num = 3*num + 1;
        	}
        	count++;
        	answer = count;
        }
        
        if(count>=500 && num!=1) {
        	answer = -1;
        }
        
        return answer;
    }
	
	
	
	
	public static void main(String[] args) {
		System.out.println(solution(626331));

	}

}
