package Oct.Abstractbankexample;

public class Lab0008 {
    public static void main(String[] args)
    {
        double iamt=800;
        double damt=500;
        double wamt=600;
        SavingAccount sa=new SavingAccount(58600,1900);
        CurrentAccount ca=new CurrentAccount(45989,9977);

       sa.Deposit();
        sa.Withdraw();
        ca.Deposit();
        ca.Withdraw();


    }
}
