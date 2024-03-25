package designpatterns.coffeepoweredcrew.creational.factorymethod;

import designpatterns.coffeepoweredcrew.creational.factorymethod.message.Message;
import designpatterns.coffeepoweredcrew.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
