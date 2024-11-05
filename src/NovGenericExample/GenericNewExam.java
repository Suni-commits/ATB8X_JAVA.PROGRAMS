package NovGenericExample;

public class GenericNewExam {
    public static void main(String[] args){
        Genericclass<Integer> gen=new Genericclass(20);
        Genericclass<String> gs=new Genericclass("Apple");
        System.out.println(gen.getData());
        System.out.println(gs.getData());

    }
}
class Genericclass<T> {
    private T data;

    public Genericclass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
