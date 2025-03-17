package sec05.exam01;

public class Car {
	
	// Field
	String model;
	int speed;
	
	// Constructor
	Car(){}
	
	Car(String model){
		this.model = model;
	}
	
	// Method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	void run() {
		for(int i = 10; i <= 50 ; i+=10) {
			this.setSpeed(i); // this 생략 가능.
			System.out.println(this.model + "가 달립니다. " + "속도: " + this.speed); // this 생략 가능.
		}
	}
}

