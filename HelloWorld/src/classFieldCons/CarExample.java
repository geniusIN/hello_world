package classFieldCons;

public class CarExample {

	public static void main(String[] args) {
		
		//다른 클래스에서 Car 객체를 사용하려면 먼저 생성해야한다.
		Car myCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		
		
	}

}
