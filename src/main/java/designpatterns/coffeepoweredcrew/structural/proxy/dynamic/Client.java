package designpatterns.coffeepoweredcrew.structural.proxy.dynamic;
import designpatterns.coffeepoweredcrew.structural.proxy.Image;
import designpatterns.coffeepoweredcrew.structural.proxy.Point2D;


public class Client {

	public static void main(String[] args) {
		//Get Image from factory.
		Image img = ImageFactory.getImage("MyPic.bmp");
		//Client is again unaware of existence of proxy 
		img.setLocation(new Point2D(10, 10));
		System.out.println("Image Location: "+img.getLocation());
		System.out.println("Starting render...");
		//Actual object should be created at this time
		img.render();
	}
}
