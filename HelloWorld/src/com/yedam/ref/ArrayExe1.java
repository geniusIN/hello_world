package com.yedam.ref;

public class ArrayExe1 {
	public static void main(String[] args) {
		int[] intAry = {10, 20, 30};
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("------------------------");
		
		
//		intAry = {40, 50, 60}; => 오류. 초기값 할당할 때만 이렇게
		
		intAry = new int[] {40, 50, 60}; // 값을 새로 할당
		
		intAry = new int[10]; // {0, 0, 0, ..., 0}
		intAry[3] = 30; // 3번째 값을 30으로 변경
		intAry[9] = 90; // 9번째 값을 90으로 변경
		
//		intAry[10] = 100; // 예외(exception) 발생. 0번부터 9번까지 밖에 없는데 10번을 써서!
		
		intAry[0] = (int)(Math.random()*100) +1;
		for(int i = 0; i<intAry.length; i++) {
			if(intAry[i]==0) {
				intAry[i]=(int)(Math.random() * 100 ) + 1 ;
			}
		}
		
		
		
		
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
	} // end of main().
}
