package entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {

    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Holder: " + holder + "\n");
        sb.append("Account Number: " + number + "\n");
        sb.append("Balance: " + String.format("%.2f", balance) + "\n");
        sb.append("Interest Rate: " + interestRate + "\n");


        return sb.toString();
    }
}