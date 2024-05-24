package designpatterns.coffeepoweredcrew.behavioral.nullobject;

public class Client {

	public static void main(String[] args) {
//		ComplexService service = new ComplexService("Simple report",new StorageService());
		ComplexService service = new ComplexService("Simple report 2",new NullStorageService());
		service.generateReport();
	}

}
