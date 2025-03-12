package com.gnhi.enumType;
import java.util.Calendar;

public class EnumType {

	public enum Week {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	
	public static void main(String[] args) {
	
	
	
	Calendar cal = Calendar.getInstance();
	int week = cal.get(Calendar.DAY_OF_WEEK); //java 기본 내장 객체
	
	Week today = null;
	
	switch(week) {
	
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
	}
	System.out.println("오늘 요일: " + today);
		
	
	if(today == Week.SUNDAY) {
		System.out.println("일요일에는 축구를 합니다.");
		
	}else {
		System.out.println("열심히 자바 공부합니다.");
	}
	
		
		
	}

}
