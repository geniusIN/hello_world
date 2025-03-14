package method;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int[] valuse1 = {1, 2, 3};
		myCom.sum1(valuse1);
		myCom.sum1(new int[] {1, 2, 3});

	}

}
