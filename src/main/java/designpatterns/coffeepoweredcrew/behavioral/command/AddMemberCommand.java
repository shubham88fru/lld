package designpatterns.coffeepoweredcrew.behavioral.command;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command {

    private String email;
    private String list;

    private EWSService receiver;

    public AddMemberCommand(String email, String list, EWSService receiver) {
        this.email = email;
        this.list = list;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addMember(email, list);
    }
}
