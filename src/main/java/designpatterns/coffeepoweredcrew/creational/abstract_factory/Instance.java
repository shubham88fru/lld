package designpatterns.coffeepoweredcrew.creational.abstract_factory;

//Represents an abstract product
public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
