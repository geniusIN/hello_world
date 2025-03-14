package com.yedam.inheritance;
/*
 * Friend 클래스를 상속받는 클래스
 */
public class UnivFriend extends Friend {
	
	//필드 생성
	private String univName;
	private String major;
	
	
	//생성자 생성
	public UnivFriend() {
		super();
	}
		
	public UnivFriend(String name, String tel, String univName, String major) {
		
		super(name, tel); // 부모생성자
		this.univName = univName;
		this.major = major;
		
	}
	
	//getter, setter 생성
	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	// overriding: 부모의 메소드 ->> 자식이 재정의.
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
}
