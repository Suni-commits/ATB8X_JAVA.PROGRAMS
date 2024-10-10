package Oct;
interface Animalss
{
    int a=20;
    int b=30;
    public void animalSound(); // interface methods does not have body
    public void Sleep(); //interface methods does not have body
}
class Pig implements Animalss{
    public void animalSound(){
        System.out.println("Pig gives sounds like wee Wee");

    }
    public void Sleep()
    {
        System.out.println("Pig sleeps like Zeee");
    }

}

public class Multiplente {
    public static void main(String[] args){

        Pig p=new Pig();
        p.animalSound();
        p.Sleep();
        System.out.println(p.a+p.b);
    }
}
