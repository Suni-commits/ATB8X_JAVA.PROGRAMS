package NovGenericExample;


    class Genric<T>{
        private T value;
        public  Genric(T value){
            this.value=value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
public class GenricClassexample {
    public static void main(String[] args){
        Genric<Integer> gn=new Genric<>(123);
        System.out.println("The integer value is " + gn.getValue());

        Genric<String> g=new Genric<String>("suneetha");
        System.out.println("Generic Text is " + g.getValue());
    }


}
