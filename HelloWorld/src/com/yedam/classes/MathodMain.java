package com.yedam.classes;

public class MathodMain {

	public static void main(String[] args) {
		// 상품코드: M001, 상품명: 만년필, 가격: 10000원
		MethodExe2 m2 = new MethodExe2(); // 클래스 주소 참조해서 호출
		
		if(m2.add(new Product("M001", "만년필", 10000))){
			System.out.println("등록 성공");
		}
		
		// 삭제
		if(m2.remove("B001")){
			System.out.println("삭제 성공");
		}
		
		// 수정
		Product prod = new Product("A001", "지우개1000", 1000);
		if (m2.modify(prod)) {
			System.out.println("수정 성공");
		}

		
		// 조회
		Product search = new Product();
		search.setProductName("ALL");
		search.setPrice(700);
		
		Product[] list = m2.productList(search); // productList 실행
			for(int i = 0; i < list.length; i++) {
				if(list[i] != null) {
					System.out.println(list[i].showList());
				}
			}
		
		
			
			
	} // end of main().
	
	
	
	
	
	
	
	// main 안에 있던거 void로 잠시 옮겼음..
	void method1() {
		MethodExe1 m1 = new MethodExe1(); // m1에 MethodExe1 객체(인스턴스)의 주소를 담는다.
		System.out.println(m1);
		m1.printString(); // 저장된 주소를 참조해서 printSting 기능을 실행. (매개변수 x)
		
		m1.printStrings(3); // 매개변수가 1개
		
		
		m1.printSomething(4, "x"); // 매개변수가 여러개
		
		int resultResult = m1.sum(); // resultResult에 반환된 값을 담는다.
		
		System.out.println(resultResult);
		
		
		// 반환된 값이 없을 때는, 즉 클래스의 필드의 데이터타입이 void일 때는 값을 담을 수 없다.
		
		
		int resultResult2 = m1.sum2(10, 50);
		System.out.println(resultResult2);
		
		
		double sum = m1.sum(10.5, 50); // ---> int타입이 자동으로 double로 형변환 되어 계산됨.
		System.out.println(sum);
		
		
		int sumarr = m1.sum(new int[]{1, 20, 30});
		System.out.println(sumarr);
		
		
		double sumarr2 = m1.sum(new double[] {10.5, 20, 3});
		System.out.println(sumarr2);
	}

}


