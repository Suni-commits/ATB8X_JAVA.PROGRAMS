package Oct.AssignmentsonString;

public class Excercise2 {
    public static void main(String[] args)
    {
        //use case 3---palindrome number
        int n=3553;
        int revnum=0;
        int reminder;
        //store the number into original number
        int originalnum=n;
        while(n !=0)
        {
            reminder=n%10;
            revnum=revnum*10+reminder;
            n/=10;
        }
        //check if reverse number and original num are equal
        if(originalnum ==revnum)
        {
            System.out.println("The original number is palindrome " +originalnum);
        }
        else {
            System.out.println("The original number is not palindrome " +originalnum);
        }
    }
}
