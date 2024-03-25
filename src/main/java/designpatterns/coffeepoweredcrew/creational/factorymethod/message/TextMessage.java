package designpatterns.coffeepoweredcrew.creational.factorymethod.message;

public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		return "Text";
	}
	
}
