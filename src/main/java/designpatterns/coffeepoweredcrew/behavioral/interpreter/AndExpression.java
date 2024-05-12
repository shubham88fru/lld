package designpatterns.coffeepoweredcrew.behavioral.interpreter;

//Non-terminal expression - will have child expressions.
public class AndExpression implements PermissionExpression {

    //child expressions.
    private PermissionExpression one;
    private PermissionExpression two;

    public AndExpression(PermissionExpression one, PermissionExpression two) {
        this.one = one;
        this.two = two;
    }
    @Override
    public boolean interpret(User user) {
        return one.interpret(user) && two.interpret(user);
    }

    @Override
    public String toString() {
        return one + " AND " + two;
    }
}
