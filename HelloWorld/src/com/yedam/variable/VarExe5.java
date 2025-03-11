package com.yedam.variable;

import java.util.Scanner;

// 예금, 출금, 잔고확인
public class VarExe5 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 예금액을 저장하는 변수. 10만원이 최대, 잔액은 > 0 조건.
		Scanner scn = new Scanner(System.in);
		while(run) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			int menu = scn.nextInt();
			switch(menu) {
			case 1: 
				System.out.print("금액을 입력>>");
				int amt = scn.nextInt();
				if(balance + amt > 100000) {
				System.out.println("10만 원 초과");
				} else {
					balance = balance + amt;
				} break; // case 1 종료.
			case 2: 
				System.out.print("금액을 입력>>");
				amt = scn.nextInt();
				if(balance - amt > 0) {
					balance = balance - amt;
				} else {
					System.out.println("잔액이 0보다 커야합니다.");
				}
				
				break; // case 2 종료.
			case 3: 
				System.out.println(balance);
				break; // case 3 종료.
			case 4: 
				run = false;
			}
		}
		System.out.println("end of prog.");
	} //end of main().
}
