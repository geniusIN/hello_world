package com.yedam.classes;

/*
 * 상품코드, 상품명, 가격 정보를 담은 클래스
 */
public class Product {
	private String productCode; // 필드
	private String productName; // 필드
	private int price; // 필드
	
	Product(){} // 생성자
	Product(String pc, String pn, int price){
		productCode = pc; // 필드의 초기값 지정
		productName = pn;
		this.price = price;
	}
	
	// Source - Generate Getters and Setters
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//목록 보여주는 메소드.
	public String showList() {
		return productCode + " " + productName + " " + price;
	}
}
