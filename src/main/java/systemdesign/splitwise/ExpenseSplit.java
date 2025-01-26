package systemdesign.splitwise;

import java.util.List;

public interface ExpenseSplit {
    void validateSplitRequest(List<Split> splitDetails, double amount);
}
