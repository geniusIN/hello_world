package sec06.exam06;

public class CarExample {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.setSpeed(100);
		int spd = myCar.getSpeed();
		
		System.out.println(spd);
		
		myCar.setStop();
		
		if(myCar.isStop()){
			System.out.println("정지중");
		} else {
			System.out.println("달리는 중");
		}
		
	}

}
