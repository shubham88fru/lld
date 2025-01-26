package systemdesign.splitwise;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {
        switch (splitType) {
            case EQUAL -> {
                return new EqualExpense();
            }
            case UNEQUAL -> {
                return new UnequalExpense();
            }
            case PERCENT -> {
                return new PercentExpense();
            }
            default -> {
                return null;
            }
        }
    }
}
