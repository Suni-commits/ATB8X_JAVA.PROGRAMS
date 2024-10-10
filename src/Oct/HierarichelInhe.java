package Oct;

class Birds
{
    void printB()
    {
        System.out.println("I am from Birds family");
    }
}
class sparrow extends Birds{
    void printS()
    {
        System.out.println("within Birds, i am from sparrows group");
    }

}
class parrot extends Birds{
    void printP()
    {
        System.out.println("within Birds, i am from parrots group");
    }

}
public class HierarichelInhe {
    public static void main(String[] args)
    {
        parrot p=new parrot();
        sparrow s=new sparrow();
        p.printB();
        p.printP();
        s.printB();
        s.printS();


    }
}
