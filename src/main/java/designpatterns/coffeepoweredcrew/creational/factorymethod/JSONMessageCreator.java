package designpatterns.coffeepoweredcrew.creational.factorymethod;

import designpatterns.coffeepoweredcrew.creational.factorymethod.message.JSONMessage;
import designpatterns.coffeepoweredcrew.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
