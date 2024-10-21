package Oct.WrapperClasses;

public class Example2 {
    public static void main(String[] args){
        //String to double
        String st1="23.5";
        String st2="45.8";

        Double s1=Double.parseDouble(st1);
        Double s2=Double.parseDouble(st2);
        System.out.println((s1*s2));

        //String to boolean

        String str="welcome";
        Boolean b=Boolean.parseBoolean(str);
        System.out.println(b);// otherthan true or false for string value, it will return false

    }
}
