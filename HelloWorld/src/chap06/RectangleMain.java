package chap06;

public class RectangleMain {

	public static void main(String[] args) {
		
		Rectangle areaRect = new Rectangle();
		
		double rect1 = areaRect.areaRectangle(5);
		System.out.println(rect1);
		
		double rect2 = areaRect.areaRectangle(5, 10);
		System.out.println(rect2);

	}

}
