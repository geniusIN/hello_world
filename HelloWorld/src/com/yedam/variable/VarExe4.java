package com.yedam.variable;
import java.util.Scanner;
public class VarExe4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] scores = new int[3]; //{0, 0, 0} 배열 선언.
		// 점수를 입력하세요.
		// 값 입력.
		// 입력한 값의 합을 콘솔에 출력.
		for(int i = 0; i<scores.length; i++) {
			System.out.print("점수를 입력하세요>");
			scores[i] = scn.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("합은 " + sum + "입니다.");
		
		double avg = sum*1.0 / 3;
		System.out.println("평균: " + avg);
	}
}
