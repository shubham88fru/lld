package designpatterns.coffeepoweredcrew.behavioral.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		Command c1 = new AddMemberCommand("a@a.com", "spam", service);
		MailTasksRunner runner = MailTasksRunner.getInstance();
		runner.addCommand(c1);

		Command c2 = new AddMemberCommand("b@b.com", "spam", service);
		runner.addCommand(c2);

		Thread.sleep(3000);
		runner.shutdown();
	}

}
