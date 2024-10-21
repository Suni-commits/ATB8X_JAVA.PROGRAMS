package Oct.ExceptionHandling;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args){
        //Multiple catch blocks

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        try{
            int n=sc.nextInt();
            System.out.println(200/n);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Exception was handled by the blocks");
        }
    }
}
