package method;

public class ComputerExample {

	public static void main(String[] args) {
		
		// 객체 생성
		Computer myCom = new Computer();
		
		// 배열 선언
		int[] valuse1 = {1, 2, 3};
		
		// 배열을 sum1의 매개값으로 할당해서 return 값을 result1에 저장
		int result1 = myCom.sum1(valuse1);
		System.out.println(result1);
		
		
		// (이렇게 해도 됨)
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println(result2);
		
		// sum2
		int result3 = myCom.sum2(1, 2, 3);//<<-- 결과는 똑같으나 매개값 표현 방식이 다름
		System.out.println(result3);
	}

}
