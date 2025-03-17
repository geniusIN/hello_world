package com.yedam.api;

class Member {
	
	String name;
	int age;
	
	Member() {}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		// 비교대상(매개값) Member타입인가?
		if(obj instanceof Member) {
			
			Member target = (Member) obj;
			return this.name.equals(target.name) && this.age == target.age; // 이름과 나이가 같으면 true, 하나라도 다르면 false 리턴.
			
		}
		return false;
	}


	@Override
	public int hashCode() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + " 나이: " + age;
	}
}
public class ObjectExe1 {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//비교
		System.out.println(obj1 == obj2); // --> 주소값 비교. 당연히 false
		System.out.println(obj1.equals(obj2)); // 논리적 비교
		
		Member m1 = new Member();
		Member m2 = new Member();
		m1.name = "홍길동";
		m1.age = 20;
		m2.name = "홍길동";
		m2.age = 20;
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));

	}

}
