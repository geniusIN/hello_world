package method;

public class Computer {
	
	// 메소드 생성
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		return sum;
	}
	
	// 메소드 생성
	int sum2(int ...values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		return sum;
	}
}
