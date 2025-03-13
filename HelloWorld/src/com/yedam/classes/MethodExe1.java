package com.yedam.classes;

public class MethodExe1 {
	
	// 리턴타입 메소드이름 (매개변수...){}
	void printString() {
		System.out.println("*");
	} // 매개변수가 없을 때
	
	
	
	void printStrings(int numOfStar) {
			for(int i = 1; i <= numOfStar; i++) {
				System.out.println("*");
			}
	} // 매개변수가 있을 때
	
	
	
	void printSomething(int times, String str) {
		for(int i = 1; i <= times; i++) {
			System.out.println(str);
		}
	} // 매개변수가 여러개
	
	
	
	int sum() {
		int result = 0;
		result = 10 + 20;
		return result; // 정수값을 반환해야 함. void가 아니니까
	}
	
	
	
	int sum2(int n1, int n2) {
		int result2 = n1 + n2;
		return result2;
	}
	
	
	
	double sum(double n1, double n2) {
		return (n1 + n2);
	} // 같은 이름이지만 매개변수 타입이 달라짐.
	
	
	
	// 배열의 요소의 합(정수를 담은 배열이 매개값으로)
	int sum(int[] ary) {
		int result = 0;
		for(int i=0; i < ary.length; i++) {
			result += ary[i];
		}
		return result;
	}
	
	
	
	// double 타입의 배열 요소의 합
	double sum(double[] ary) {
		double result = 0;
		for(int i = 0; i < ary.length; i++) {
			result = result + ary[i];
		}
		return result;
	}
	
} // end of class.
