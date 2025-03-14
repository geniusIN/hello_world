package com.yedam;

public class HelloExe {
	public static void main(String[] args) {
	

	// 1. 32000 변수선언과 할당.
		int a = 32000;
		System.out.println("a: " + a);
	
	// 2. 34, 32, 88, 23
		int[] arr = new int[]{34, 32, 88, 23};
	// 3. 문자: 32
		String str = "32";
	// 4. 정수변수에 저장
		int strToInt = Integer.parseInt(str);
	// 5. Hello, Nice, Good
		
	// 6. 정수 5개 저장. Math.random() -> 60 ~ 100
		int[] arr1 = new int[5];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 41 + 60);
			System.out.println(arr1[i]);
		}
		
	// 7. 이름, 연락처, 나이 선언.  
	// 홍길동, 010-1234-1234, 20
		String name;
		String tel;
		int age;
		
		Hello[] mans = new Hello[100];
		mans[0] = new Hello("홍길동", "010-1111-1111", 20);
		System.out.println(mans[0].name);
		
	// 8. 위에 선언한 데이터타입 3개 담을 수 있는 공간, 값 할당
	// 홍길동, 010-1111-1111, 20
	// 김민식, 010-2222-2222, 22
	// 최문식, 010-3333-3333, 23
		mans[0] = new Hello("홍길동", "010-1111-1111", 20);
		mans[1] = new Hello("김민식", "010-2222-2222", 22);
		mans[2] = new Hello("최문식", "010-3333-3333", 23);
		
		
		
	// 9. 나이가 제일 많은 사람 이름 출력
		
		
		
		
	}
}
