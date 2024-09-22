package Sept;

public class TrianleArea {

    public static void main(String[] args)
    {
        int a = 60;
        int b = 60;
        int c = 60;
        if (a == b && b == c && a == c){
            System.out.println("This is eaquivalent traingle");
        }
        else if ( a>b && c>b  || a==c){

            System.out.println("This is isolosic traingle");
        }
            else
        {
            System.out.println("This is scale traingle");

        }
    }
}
