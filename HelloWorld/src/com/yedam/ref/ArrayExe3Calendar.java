package com.yedam.ref;
import java.io.*;
public class ArrayExe3Calendar {
	// 2025년 기준 월 정보 -> 1일의 위치를 반환
	public static int getFirstDay(int month) {
		switch(month) {
		case 1:
			return 3;
		case 2:
			return 6;
		case 3:
			return 6;
		case 4:
			return 2;
		default:
			return 1;
			
		}
	}
	
	public static int getLastDate(int month) {
		int date = 31;
		switch (month) {
		case 2:
			date = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			date = 30;
		}
		return date;
	}
		
	public static void main(String[] args) {
		
		
		
		String[] days = {"sun", "mon", "tue", "wed", "thu", "fri", "set"};
		for(String day : days) {
			System.out.print(" " + day);
		}

		System.out.println();
		int month = 3;
		int space = getFirstDay(month);
		int lastDate = getLastDate(month);
		for (int i = 0; i < space; i++) {
			System.out.print("    ");
		}
		for(int i = 1; i <= lastDate; i++) {
			if(month == 3 && i == 21) {
				System.out.print("  시험");
			}
			
			else if((space +i) %7 == 0) {
				if(String.valueOf(i).length()==1) {
					System.out.println("   " + i);
				} else if (String.valueOf(i).length()==2){
					System.out.println("  " + i);
				}
				
			} else {
				if(String.valueOf(i).length()==1) {
					System.out.print("   " + i);
				} else if (String.valueOf(i).length()==2){
					System.out.print("  " + i);
				
			}
		}
	} // end of main()
}
}