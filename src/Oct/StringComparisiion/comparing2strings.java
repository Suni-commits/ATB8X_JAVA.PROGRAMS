package Oct.StringComparisiion;

public class comparing2strings {
    public static void main(String[] args){
        String s1="Welcome";
        String s2="Welcome";
        String s3=new String("welcome");
        String s4="welcome";
        //usecase 1
        System.out.println("does objects are equal : "+(s1==s2));//true
        System.out.println("does objetcs are equal : "+(s1==s3));//false
        System.out.println("does objetcs are equal : "+(s2==s3));//false
        //use case2

        System.out.println("does objects are equal :"+s1.equals(s2));//true
        System.out.println("does objects are equal :"+s1.equals(s2));//true
        System.out.println("does objects are equal :"+s2.equals(s3));//false
        System.out.println("does objects are equal :"+s2.toLowerCase().equals(s3));//true

       // Use Case3
        String str="";
        str=s3;
        System.out.println(s4==str);//false
        System.out.println(s4.equals(str));//true
    }
}
