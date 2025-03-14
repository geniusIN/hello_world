package com.yedam.inheritance;
/*
 * 상속.
 * 친구의 정보를 관리하는 프로그램.
 * 친구1: 이름, 연락처
 * 친구2: 이름, 연락처, 학교, 학과
 * 친구3: 이름, 연락처, 회사, 부서
 * 
 */
public class FriendExe {

	public static void main(String[] args) {
		
		// 배열 생성
		Friend[] friends = new Friend[10]; 
		
		
		// instance 생성
		
		Friend f1 = new Friend();
		f1.setName("홍길동");
		f1.setTel("010-1111-2222");
		System.out.println(f1.toString());
		
		UnivFriend f2 = new UnivFriend();
		f2.setName("김자식");
		f2.setTel("010-1111-1111");
		f2.setUnivName("우리학교");
		f2.setMajor("역사학과");
		System.out.println(f2.toString());
		
		CompanyFriend f3 = new CompanyFriend("김영식", "010-2323-2323", "아마존", "개발팀");
		
		
		// 부모클래스의 변수에 자식인스턴스 대입 가능
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		
		
		//Friend[] => toString()
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}
		
		
	} // end of main()

}
