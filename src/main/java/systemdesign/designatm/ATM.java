package systemdesign.designatm;

public class ATM {
    private static ATM instance = new ATM();

    ATMState currentATMState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private ATM() {

    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public static ATM getATMObject() {
        instance.setCurrentATMState(new IdleState());
        return instance;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

//    public int getNoOfTwoThousandNotes() {return noOfTwoThousandNotes;}
//    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
//        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
//    }
//    public int getNoOfOneHundredNotes() {return noOfOneHundredNotes;}
//    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {}


    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount) {
        atmBalance -= amount;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes += number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes += number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes += number;
    }
}
