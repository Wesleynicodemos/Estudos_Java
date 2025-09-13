package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {

    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
     super(number, holder, balance);
     this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount < loanLimit) {
            balance += amount;
        } else {
            System.out.println("Limite excedido.");
        }
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Holder: " + holder + "\n");
        sb.append("Account Number: " + number + "\n");
        sb.append("Balance: " + String.format("%.2f", balance) + "\n");
        sb.append("Loan Limit: " + String.format("%.2f", loanLimit) + "\n");


        return sb.toString();
    }
}