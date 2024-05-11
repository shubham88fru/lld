package designpatterns.coffeepoweredcrew.behavioral.chainofresponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {
    private String role;

    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        //if the approver can't approve the application and there is
        //a successor to delegate to, delegate the request.
        if (!processRequest(application) && successor != null) {
            successor.processLeaveApplication(application);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return role;
    }
}