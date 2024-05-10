package designpatterns.coffeepoweredcrew.structural.proxy.dynamic;
import java.lang.reflect.Proxy;

import designpatterns.coffeepoweredcrew.structural.proxy.Image;

//Factory to get image objects. 
public class ImageFactory {
	//We'll provide proxy to caller instead of real object
	public static Image getImage(String filename) {
		//Using Java's Proxy API we create proxy instance
		return (Image) Proxy.newProxyInstance(Client.class.getClassLoader(),
				new Class[]{Image.class},
				//We provide our invocation handler to proxy
				new ImageInvocationHandler(filename));
	}
}