package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		
		Singleton obt1 = Singleton.getInstance();
		System.out.println(obt1);
		
		Singleton obt2 = Singleton.getInstance();
		System.out.println(obt1);
		
		if(obt1 == obt2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}
