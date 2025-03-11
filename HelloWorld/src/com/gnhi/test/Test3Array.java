package com.gnhi.test;
//배열, 인덱스, 배열길이, 배열선언, 배열생성, 다차원배열, 향상된 for 문

public class Test3Array {
	public static void main(String[] args) {
		int[] name1 = {0, 0, 0}; // 배열 생성 방법1
		int[] name2 = new int[3]; // 배열 생성 방법2
		int[] name3 = {0, 0, 0}; // 배열 생성 방법2
		
		int[] name4; // 배열 생성 먼저 하고 값 할당
		name4 = new int[] {1, 2, 3};
		System.out.println("name4의 2번째 값: " + name4[1]);
		
		System.out.println(name1[1] == name2[1]);
		// 배열은 new로 생성해도 요소값이 같으면 == 비교시 true가 나오네.
		// 근데 이상하다. 값도 힙영역에 배열로 저장되는데, 똑같은 주소를 참조할 수 있나?
		// ㅇㅇ 왜냐면 주소를 참조 비교한 게 아니라, 주소에 있는 값 자체를 비교한 거니까.
		
		System.out.println(name1 == name2);
		// 예상대로 이건 둘다 {0, 0, 0} 배열이지만, 주소 비교이므로 false가 나오네.
		
		System.out.println(name1 == name3);
		// new로 생성 안해도, 배열은 다른 주소에 저장되어서 false가 나온다.
		
		
		int[] ary;
//		ary = {1, 2, 3}; --> 컴파일 에러. 자바는 이런 거 안됨.
		
		ary = new int[] {1, 2, 3}; // 이건 됨!
		System.out.println(ary[1]);
		
		
		// 배열 생성하고 합, 평균 구하기
		int[] ary1 = {80, 70, 99};
		
		int sum = 0;
		for(int i = 0; i < ary1.length; i++) {
			sum = sum + ary1[i];
		}
		double avg = (double)sum / ary1.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
		
		
		
		
		// 메소드 생성해서 배열의 합 구하기!!!
		int sum2 = add(new int[] {80, 70, 99});
		System.out.println("메소드로 구한 합: " + sum2);
		
	} // end of main().
	
	// 메소드 생성!!! main 밖에서!!!!!!!
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		return sum;
	}
}
