package NovGenericExample;

public class GenericNewMethodExample {
    public static void main(String[] args){
        Demo d1=new Demo();
        d1.GenericMethod(20);
        d1.GenericMethod("Automation");
    }
}

class Demo{
    public <T> void GenericMethod(T data){
        System.out.println("Generic method");
        System.out.println(data);

    }
}
