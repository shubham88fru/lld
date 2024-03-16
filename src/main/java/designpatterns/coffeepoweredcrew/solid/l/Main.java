package designpatterns.coffeepoweredcrew.solid.l;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		
//		useRectangle(square);

	}

	//A method in code that tha expects the
	//base class as an argument. So, per Liskov's
	//substitution principle, We should be able to
	//pass Square (if it is a subclass of rect) also as an argument during method call
	//and the function should just work properly. But if we actually do that
	//the below test case will fail, when passing a square, coz, the setWidth()
	//on a square will override will also override the previously set height of the square.
	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}
}
