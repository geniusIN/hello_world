package sec05.exam04;

public class Singleton {
	
	private Singleton() {};
	private static Singleton singleton = new Singleton();
	static Singleton getInstance() {
		return singleton;
	}
}
