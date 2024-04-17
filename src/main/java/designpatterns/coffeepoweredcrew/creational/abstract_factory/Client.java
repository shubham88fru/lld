package designpatterns.coffeepoweredcrew.creational.abstract_factory;

import designpatterns.coffeepoweredcrew.creational.abstract_factory.aws.AwsResourceFactory;
import designpatterns.coffeepoweredcrew.creational.abstract_factory.gcp.GoogleResourceFactory;

public class Client {
    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        Client gcp = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Instance.Capacity.large, 4096);
        i2.start();
        i2.stop();
    }

}
