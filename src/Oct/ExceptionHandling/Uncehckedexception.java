package Oct.ExceptionHandling;

public class Uncehckedexception {
    public static void main(String[] args) {
        //Number format exception
        String s = "welcome";
        
        try{
            System.out.println(Integer.parseInt(s));
        }

        catch (Exception e)
        {
            System.out.println("Exception handled");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Exceptions are checked");
        }
    }
}
