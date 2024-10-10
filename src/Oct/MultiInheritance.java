package Oct;

class Animals
{
    void printA()
    {
        System.out.println("The dog is Animal");
    }
}
class Dogs extends Animals{
    void printD()
    {
        System.out.println("The dog is barking");
    }

}
class rhyme extends Dogs{
    void printR()
    {
        System.out.println("The dog rhyme is in  brown color");
    }

}
public class MultiInheritance {
    public static void main(String[] args){
        rhyme r=new rhyme();
        r.printA();
        r.printD();
        r.printR();

    }
}
