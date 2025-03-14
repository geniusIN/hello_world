package classFieldCons;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("김홍인", "123456-1234567");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("감자바", "989898-1241412");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
