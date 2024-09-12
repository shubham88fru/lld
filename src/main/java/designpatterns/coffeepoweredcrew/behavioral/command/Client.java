package designpatterns.coffeepoweredcrew.behavioral.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		//receiver -- the command will be invoked on this object.
		EWSService service = new EWSService();

		//command -- the actual command to be executed.
		Command c1 = new AddMemberCommand("a@a.com", "spam", service);

		//invoker -- will invoke the command.
		MailTasksRunner runner = MailTasksRunner.getInstance();
		runner.addCommand(c1);

		Command c2 = new AddMemberCommand("b@b.com", "spam", service);
		runner.addCommand(c2);

		Thread.sleep(3000);
		runner.shutdown();
	}

}
