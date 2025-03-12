package com.yedam.variable;
import java.util.Scanner;
public class VarExe6 {
//	public static void test(String[] args) {	
//		// 임의의 정수 1 ~ 50 임의의 값
////		for(int i = 1; i <= 5; i++) 
////		 System.out.println((int)(Math.random() * 50) + 1); // 0 <= x < 1
//		
//		 // 30 ~ 100 사이의 랜덤 정수
//		 // 정수 500개 저장
//		 // 100이 되면 출력
//		int[] scores = new int[500];
//		 for(int i = 0; i<5; i++) {
//	      
//	      scores[i] = ((int)(Math.random()* 71 + 30)); 
//		}
//		for(int i = 0; i < 500; i++) {
//			if(scores[i]  == 100) {
//				System.out.println(i + "번째 : " + scores[i]);
//			}
//		}
//	}// end of test().
	
	
	
	public static void main(String[] args) {
		Member m1 = new Member(); // 인스턴스 생성
//		m1.name = "홍길동";
		m1.setName("홍길동");
		
//		System.out.println(m1.score);
		System.out.println(m1.getScore());
		
//		System.out.println(m1.name);
		
		Member m2 = new Member(); // 인스턴스 생성
//		m2.name = "최민수";
		m2.setName("최민수");
		
		Member m3 = new Member(); // 인스턴스 생성
//		m3.name = "김병수";
		m3.setName("김병수");
		
		Member m4 = new Member(); // 인스턴스 생성
//		m4.name = "박인만";
		m4.setName("박인만");
		
		// 배열
		Member[] members = {m1, m2, m3, m4};
		
		// 70~100 사이의 임의의 값으로 점수지정
		
//		// 점수가 가장 높은 사람의 이름 출력
		for(int i=0; i<=3; i++) {
//			members[i].score = ((int)(Math.random() * 31 + 70));
			members[i].setScore((int)(Math.random() * 31 + 70));
		}
//		String name ="";
//		int max = members[0].score;
//		for(int i = 0; i < members.length; i++) {
//			if(max < members[i].score) {
//				max = members[i].score;
//				name = members[i].name;
//			}
//		System.out.println(max + name);
//		}
		
		
		System.out.println("조회할 이름 입력>> ");
		Scanner scn = new Scanner(System.in);
		String search = scn.nextLine();
		
		for(int i=0; i <= members.length; i++) {
			if(members[i].getName().equals(search) ) {
				System.out.println(members[i].getScore());
			}
		}
	} // end of main().
	
	
	
		
}

