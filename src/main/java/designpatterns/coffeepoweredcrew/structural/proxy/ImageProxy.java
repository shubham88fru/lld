package designpatterns.coffeepoweredcrew.structural.proxy;


//Proxy class.
public class ImageProxy implements Image {

    private String name;
    private BitmapImage image;
    private Point2D location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2d) {
        if (image != null) { //if actual object already created, directly call ops on it.
            image.setLocation(point2d);
        } else { //otherwise, hold on to the values.
            location = point2d;
        }
    }

    @Override
    public Point2D getLocation() {
        if (image != null) {
            return image.getLocation();
        }
        return location;
    }

    @Override
    public void render() {
        //The proxy only creates the real image
        //when the render method is invoked. Until then,
        //it holds the properties and when absolutely needed
        //(like when render method is invoked), it creates the
        //actual object and sets the properties on it.
        if (image == null) {
            //create the real object.
            image = new BitmapImage(name);
            //set the held properties.
            if (location != null) {
                image.setLocation(location);
            }
        }
    }
}
