package Oct.ExceptionHandling;

public class Practice1 {
    public static void main(String[] args){
        int[] mynum={2,9,10,5};
       // System.out.println(mynum[7]);//ArrayIndexOutOfBoundException

        try{
            System.out.println(mynum[7]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
