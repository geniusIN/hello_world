package com.yedam.variable;

public class VarExe8 {
	public static void main(String[] args) {
		int n1 = 10;
		byte b1 = 20;
		byte result = (byte)(b1 + 30); // 정수 연산 시 int 결과가 나옴. => 형변환(casting) 해야 함.
		System.out.println(result);
		
		result = (byte)(b1 + 130); // byte type은 -128 ~ 127. 127+1 => -128로 넘어감.
		System.out.println(result);
		
		n1 = b1; // byte -> int 자동 형변환
		System.out.println(n1);
		
		for(int i=1; i<15 ; i++) {
			System.out.println(n1);
			
		}
	}
}
