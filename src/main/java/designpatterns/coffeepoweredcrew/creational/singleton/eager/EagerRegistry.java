package designpatterns.coffeepoweredcrew.creational.singleton.eager;
/**
 * This class uses eager initialization of singleton instance.
 */
public final class EagerRegistry {
    private EagerRegistry() {}

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}