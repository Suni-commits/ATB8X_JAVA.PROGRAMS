package Oct.AssignmentsonString;

public class excercise1 {

    public static void main(String[] args)
    {
        //check string is palindrome or not
        //case 1
        String s="MADAM";
        String rev="";
        int len=s.length();

        for(int i=(len-1);i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("The palindrome is :" +rev);

        //case 2
        String s1="RADAR";
        String rev1="";
        int l1=s1.length();
        for(int i=(l1-1);i>=0;i--){
            rev1=rev1+s1.charAt(i);
        }
        System.out.println("The palindrome is :" +rev1);
    }
}
