package com.gnhi.testArgs;

public class AdvancedFor {

	public static void main(String[] args) {
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { // 배열이 int타입이므로 score도 int로 선언
			sum = sum + score;
		}
		
		System.out.println("정수 총 합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("정수 평균 = " + avg);
	}

}
