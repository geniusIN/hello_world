package com.yedam.inheritance;
/*
 * 친구1: 이름, 연락처.
 */
public class Friend extends Object{
	// Object: 모든 클래스들의 조상
	
	//필드 선언
	private String name;
	private String tel;
	
	
	//생성자 선언
	public Friend() {}
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름은 " + getName() + ", 연락처는 " + getTel();
	}
	
	
	// getter, setter 선언.
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	

	
	
	
}
