package com.yedam.bookApp;

import java.util.Scanner;

/*
 * 등록, 수정, 삭제, 목록출력
 */
public class BookMain {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		//저장공간.
		Book[] bookStore = new Book[100];
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.도서등록 2.수정 3.삭제 4.목록 9.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1:
				System.out.print("제목 입력>> ");
				String title = scn.nextLine();
				System.out.print("저자 입력>> ");
				String author = scn.nextLine();
				System.out.print("출판사 입력>> ");
				String company = scn.nextLine();
				System.out.print("가격 입력>> ");
				int price = scn.nextInt();
				scn.nextLine();
				Book book = new Book(title, author, company, price);
				for(int i = 0; i < bookStore.length; i++) {
					if(bookStore[i] == null) {
						bookStore[i] = book;
						break;
					}
				}
				
				break;
				
				
			case 2:
				
			case 3:
			case 4:
				System.out.print("제목        저자    가격");
				System.out.print("====================");
				for(Book book : bookStore) {
					System.out.println(book.showList());
				}
			case 9:
				run = false;
			default:
				System.out.println("메뉴를 다시 선택하세요!");
			}
		}
		System.out.println("end of prog.");
		
	} // end of main().
}
