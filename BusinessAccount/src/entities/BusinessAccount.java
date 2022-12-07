package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
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

    @Override
    public void deposit(Double amount) {
        super.deposit(amount);
    }

//    BusinessAccount tem como taxa de saque padrao -5.0 mais uma taxa de -2.0
    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
}
