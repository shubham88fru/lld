package designpatterns.coffeepoweredcrew.creational.object_pool;

public class Client {
    public static final ObjectPool<Bitmap> bitmapPool =
            new ObjectPool<Bitmap>(() -> new Bitmap("Logo.bmp"), 5);
    public static void main(String[] args) {
            Bitmap bm1 = bitmapPool.get();
        bm1.setLocation(new Point2D(10, 10));

        Bitmap bm2 = bitmapPool.get();
        bm2.setLocation(new Point2D(-10, 0));

        bm1.draw();
        bm2.draw();

        bitmapPool.release(bm1);
        bitmapPool.release(bm2);
    }
}
