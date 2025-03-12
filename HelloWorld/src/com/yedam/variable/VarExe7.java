package com.yedam.variable;
import java.util.Scanner;

// 추가, 수정, 삭제, 목록출력
public class VarExe7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Member[] storage = new Member[100]; // {null, null, ..., null}
		storage[0] = new Member("홍길동", 83);
		storage[1] = new Member("김민혁", 86);
		storage[2] = new Member("한수아", 70);
		
		while(run) {
			System.out.print("1.등록 2.수정 3.삭제 4.출력 5.평균 6.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine()) ; // 1 엔터.
			
			switch(menu) {
			case 1: //등록
				System.out.print("이름입력>> ");
				String name = scn.nextLine();
				System.out.print("점수입력>> ");
				int score = Integer.parseInt(scn.nextLine()) ;
				Member member = new Member(); // 인스턴스 생성
//				member.name = name;
//				member.score = score;
				member.setMember(name, score);
				// 빈공간에 값을 할당
				for(int i = 0; i<storage.length; i++) {
					if(storage[i] == null) {
						storage[i] = member;
						break; // for문 종료.
					}
				}
				
				break; // case 1 종료.
				
			case 2: //수정
				System.out.print("이름입력>> ");
				name = scn.nextLine();
				for(int i = 0; i < storage.length; i++) {
					if(storage[i] != null && storage[i].getName().equals(name)) {
						System.out.print("수정할 점수 입력>> ");
						score = Integer.parseInt(scn.nextLine());
						storage[i].setScore(score);
						break;
					}
				}
				break;
			case 3: //삭제: 이름 입력받고, 일치하는 이름 찾아서 배열 값을 null 값으로.
				System.out.print("이름입력>> ");
				name = scn.nextLine();
				boolean isExist = false;
				for(int i = 0; i < storage.length; i++) {
					isExist = false;
					if(storage[i] != null && storage[i].getName().equals(name)) {
						storage[i] = null;
						System.out.println("삭제되었습니다.");
						isExist = true;
						break;
					}
				}
				if(!isExist) {
					System.out.println("찾는 이름이 없습니다.");
				}
				break;
			case 4: //목록 출력.
				for(int i = 0; i<storage.length; i++) {
					if(storage[i] != null) {
						System.out.println(storage[i].getName() + " " + storage[i].getScore());
					}
				}
				break;
			case 5: //평균: 등록된 점수들의 평균
				int sum = 0, count = 0;
				for(int i = 0; i < storage.length; i++) {
					if(storage[i] != null) {
					sum = sum + storage[i].getScore();
					count = count+1;
					}
				}
				
				System.out.println(sum*1.0/count);
				break;
			case 6:
				run = false;
			}
			
		}
		System.out.println("end of prog.");
	} // end of main().
}
