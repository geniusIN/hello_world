package returnMethod;

public class Calculator {
//Field
	
//Constructor
	
//Method
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); //plus 메소드 사용
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result ); //println 메소드 사용
		
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	// 이렇듯, 같은 클래스 내에서 메소드 호출 시 이름만으로 사용 가능.
}
