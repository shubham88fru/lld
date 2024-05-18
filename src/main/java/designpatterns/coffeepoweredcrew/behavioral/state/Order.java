package designpatterns.coffeepoweredcrew.behavioral.state;

//Context class
public class Order {

	private OrderState currentState;

	public Order() {
		currentState = new New();
	}
	public double cancel() {
		double charges = currentState.handleCancellation();
		currentState = new Cancelled();
		return charges;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid(); //transition the state.
	}
	
	public void dispatched() {
		currentState = new InTransit(); //transition the state.
	}
	
	public void delivered() {
		currentState = new Delivered(); //transition the state.
	}
}
