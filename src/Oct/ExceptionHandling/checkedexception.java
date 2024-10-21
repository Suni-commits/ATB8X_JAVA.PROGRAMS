package Oct.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checkedexception {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException  {

        System.out.println("Program started...");
        System.out.println("Prgram inprogress...");
        FileInputStream fis=new FileInputStream("c://text.txt");
                Thread.sleep(3000);
        System.out.println("Programm finished...");
    }
}
