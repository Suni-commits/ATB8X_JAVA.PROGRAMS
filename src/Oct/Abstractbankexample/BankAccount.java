package Oct.Abstractbankexample;

abstract class BankAccount {
        double accountno;
        double amt;
    public BankAccount(double accountno,double amt) {
        this.accountno = accountno;
        this.amt = amt;
    }
       double getAccountno()
        {
            return accountno;
        }
        double getBalance()
        {
            return amt;
        }
    protected void setBalance(double amt)
    {
        this.amt=amt;
    }

    abstract void Deposit();
    abstract void Withdraw();
}
