package designpatterns.coffeepoweredcrew.creational.singleton.eager;

public class Client {

	public static void main(String[] args) {
		EagerRegistry registryEager1 = EagerRegistry.getInstance();
		EagerRegistry registryEager2 = EagerRegistry.getInstance();
		System.out.println(registryEager1);
		System.out.println(registryEager2);

		LazyRegistryWithDCL registryWithDCL1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL registryWithDCL2 = LazyRegistryWithDCL.getInstance();
		System.out.println(registryWithDCL1);
		System.out.println(registryWithDCL2);

		LazyRegistryIODH lazyRegistryIODH1;
	}

}
