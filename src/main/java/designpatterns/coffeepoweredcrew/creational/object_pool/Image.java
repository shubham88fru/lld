package designpatterns.coffeepoweredcrew.creational.object_pool;

//Represents our abstract reusable
public interface Image extends Poolable {

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
