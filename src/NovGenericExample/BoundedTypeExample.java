package NovGenericExample;

public class BoundedTypeExample <T extends String> {
    public void display(){
        System.out.println("This is bounded type generic example");
    }

    public static void main(String[] args){
        BoundedTypeExample bte=new BoundedTypeExample();
        bte.display();
    }
}
