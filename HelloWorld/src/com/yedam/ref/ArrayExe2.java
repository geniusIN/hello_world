package com.yedam.ref;

import com.yedam.variable.Member;


public class ArrayExe2 {
 public static void main(String[] args) {
	 String[] strAry = {"Hello", "World", "20", "23.4"};
	 //확장 for문
	 for(String str : strAry) {
		 System.out.println(str);
	 }
	 
	 //배열 크기 지정
	 strAry = new String[10]; // {null, null, ...}
	 
	 
	 strAry[0] = new String("Nice");
	 for (String str : strAry) {
		 System.out.println(str);
	 }
	 
	 // Member 클래스
	 Member[] memAry = new Member[10]; // {null, null ...}
	 memAry[0] = new Member();
	 memAry[0].setMember("홍길동", 80);
	 memAry[0].setScore(90);
	 memAry[0].showInfo();
	 
	 memAry[1] = new Member();
	 memAry[1].setMember("박민동", 85);
	 memAry[1].setScore(100);
	 memAry[1].showInfo();
	 
	 for (int i = 0; i < memAry.length; i++) {
		 if (memAry[i] != null)
			 memAry[i].showInfo();
	 }
 }
}
