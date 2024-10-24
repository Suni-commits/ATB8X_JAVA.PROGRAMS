package Oct.OOPSPractice.Oct24.MethodsandClasses;

public class Accountdetails {
    private String name,email;
    private long accnum;
    private double amount;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAccnum() {
        return accnum;
    }

    public void setAccnum(long accnum) {
        this.accnum = accnum;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public static class Lab0010 {
        public static void main(String[] args){
            Accountdetails ad=new Accountdetails();
          ad.setName("John Smith");
         System.out.println("The name of the account holder is "+ad.getName());
          ad.setEmail("adbcd@xyz.com");
          ad.setAccnum(24548844);
          ad.setAmount(134434);
            System.out.println("The email id of the account holder is  "+ad.getEmail());
            System.out.println("The Account number of the account holder is  "+ad.getAccnum());
            System.out.println("The amount credited in the account is  "+ad.getAmount());
        }
    }
}
