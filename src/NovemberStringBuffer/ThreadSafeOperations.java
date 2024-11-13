package NovemberStringBuffer;

public class ThreadSafeOperations {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Initial Text");
        //Creating two threads

        Thread t1=new Thread(()->
        {
            sb.append(" - Thread 1");
            System.out.println(sb);

        });

        Thread t2=new Thread(()->
        {
          sb.append(" - Thread 2");
          System.out.println(sb);
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Final String Buffer:  " + sb);
    }
}
