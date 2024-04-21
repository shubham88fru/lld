package designpatterns.coffeepoweredcrew.creational.object_pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

//Pool anything that extends Poolable.
public class ObjectPool<T extends Poolable> {
    //in-memory cache for the pool. BlockingQueue gives
    //some level of thread safety, so we don't have to
    //worry about maintaining thread safety ourselves.
    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingDeque<>();
        for (int i=0; i<count; i++) {
            availablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            System.out.println("take() was interrupted");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.out.println("put() was interrupted");
        }
    }
}
