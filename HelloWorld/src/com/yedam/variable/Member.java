package com.yedam.variable;
// public vs private -> public: 다른 클래스에서 접근 가능, private: 불가능
public class Member {
	// 클래스: 필드(값을 저장)
	
	private String name;
	public int score;
	// 클래스: 매소드(기능) = 반환할 메소드명(매개값)
	
	public void showInfo() {
		System.out.println("이름은 " + name + ", 점수는 " + score);
	}
	public void setMember(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	//score 필드의 값을 지정
	public void setScore(int score) {
		if(score<0) {
			System.out.println("점수는 0보다 큰값입니다.");
			return; // 메소드의 종료
		}
		this.score = score;
	}
	
	//클래스의 생성자: 실체 생성
	//컴파일러 기본생성자
	//생성자 overloading
	public Member() {
		
	} // 기본생성자
	
	public Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
