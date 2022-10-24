package seminarstudent;

public class Loan {

    int loanID;

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    double amount;

    @Override
    public String toString() {
        return "Loan{" +
                "loanID=" + loanID +
                ", amount=" + amount +
                '}';
    }
}
