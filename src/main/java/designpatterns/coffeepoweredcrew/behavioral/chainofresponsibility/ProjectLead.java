package designpatterns.coffeepoweredcrew.behavioral.chainofresponsibility;

//A concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    //Project Lead can approve sick leaves upto two days.
    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getType() == LeaveApplication.Type.Sick) {
            if (application.getNoOfDays() <= 2) {
                application.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
}
