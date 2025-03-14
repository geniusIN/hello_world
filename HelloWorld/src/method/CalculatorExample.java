package method;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(2, 30);
		System.out.println(result1);
		
		double result2 = myCalc.divide(3, 2);
		System.out.println(result2);
		
		myCalc.powerOff();
		
	}

}
