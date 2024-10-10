package Oct;

class Animal
{
    void PrintA()
    {
        System.out.println("The dog is Animal");
    }

}
class Dog extends Animal{
    void printD()
    {
        System.out.println("The dog is barking");
    }

}

public class NameTestSinglle {

    public static void main(String[] args){
        Dog d=new Dog();
        d.PrintA();
        d.printD();

    }
}
