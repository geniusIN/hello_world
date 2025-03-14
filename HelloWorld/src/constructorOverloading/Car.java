package constructorOverloading;

public class Car {
	//Field
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		
		//Constructor
		Car() {
			
		}
		
		
//		Car(String model) {
//			this.model = model;
//		}
		
		Car(String model) {
			this(model, null, 0); // 다른 생성자를 불러와서 생성자 만들기
		}
		
//		Car(String model, String color){
//			this.model = model;
//			this.color = color;
//		}
		
		Car(String model, String color){
			this(model, color, 0);
		}
		
		Car(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
		
}
