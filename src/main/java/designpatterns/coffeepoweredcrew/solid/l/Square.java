package designpatterns.coffeepoweredcrew.solid.l;

public class Square implements IShape {

	private int side;


	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public int computeArea() {
		return side*side;
	}
}
