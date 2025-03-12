package com.gnhi.testArgs;

public class ArrayCopy {

	
	public static void main(String[] args) {

		//for문 이용
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for(int i = 0; i < newIntArray.length; i++) {
		System.out.println(newIntArray[i]);
	}

		
		System.out.println("");
		

		
} // end of main().
}