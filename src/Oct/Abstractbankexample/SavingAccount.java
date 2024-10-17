package Oct.Abstractbankexample;

public class SavingAccount extends BankAccount{

    public SavingAccount(double accountno,double amt)
    {
        super(accountno, amt);

    }
    @Override
    void Deposit() {
        setBalance(getBalance()+amt);
        System.out.println("Deposit amount is " +amt+ "succesfully.Now the balance is "+getBalance());
    }

    @Override
    void Withdraw() {
        if(getBalance()>=amt)
        {
              setBalance(getBalance()-amt);
            System.out.println("Deposit amount is " +amt+ "succesfully.Now the balance is "+getBalance());
        }
        else {
            System.out.println("insuffient balance");
        }
    }
}

