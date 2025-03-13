package com.yedam.classes;

public class MethodExe2 {
	
	Product[] store; // 필드
	
	
	// 생성자(필드의 값을 초기화)
	MethodExe2(){
		store = new Product[10]; //Product 객체를 10개 담을 수 있는 공간 생성
		store[0] = new Product("A001", "지우개", 500);
		store[1] = new Product("B001", "샤프1000", 1000);
		store[2] = new Product("C001", "연필800", 800);
		store[3] = new Product("D001", "지우개", 1800);
	}
	
	
	// 메소드(기능)
	boolean add(Product prd) {
		for(int i = 0; i < store.length; i++) {
			if(store[i] == null) {
				store[i] = prd;
				return true;
			}
			
		}
		return false;
	} // end of add(Product prd).
	
	// 상품이름, ALL 조회
	Product[] productList(Product prd) { // productList 정의
		Product[] list = new Product[10];
		int idx = 0;
		for(int i = 0; i < store.length; i++) {
			if(store[i] != null) {
				if(prd.getProductName().equals("ALL") || store[i].getProductName().equals(prd.getProductName())) {
					if(store[i].getPrice() >= prd.getPrice()) {
						list[idx++] = store[i];						
					}
				}
			}
		}
		return list;
	} // end of productList.
	
	
	// 삭제 => boolean remove(String code)
	boolean remove(String code) {
		for(int i = 0; i < store.length; i++) {
			if(store[i].getProductCode().equals(code)) {
				store[i] = null;
				return true;
			}
		}
		return false;
	}
	
	
	// 수정 => boolean modify(Product prod)
	boolean modify(Product prod) {
		for(int i = 0; i < store.length; i++) {
			if(store[i] != null && store[i].getProductCode().equals(prod.getProductCode())) {
				
				// 상품명 수정
				if(prod.getProductName() != null) {
					store[i].setProductName(prod.getProductName());
				}
				// 상품가격 수정
				if(prod.getPrice() != 0) {
					store[i].setPrice(prod.getPrice());
				}
				
				return true;
			}
		}
		return false;
	}
	
	
	
	}
	
	
 // end of class.
