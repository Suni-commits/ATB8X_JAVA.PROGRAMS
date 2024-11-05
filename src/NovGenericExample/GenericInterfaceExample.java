package NovGenericExample;

interface Pair<K,V>{
    K getKey();
    V getValue();
}
class SimplePair<K,V> implements Pair<K,V>{
    private K key;
    private V value;

    public SimplePair(K key,V value){
        this.key=key;
        this.value=value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

}

public class GenericInterfaceExample {
    public static void main(String[] args){
        Pair<Integer,String> sp=new SimplePair<>(1, "Atomation");
        System.out.println("Key : "+ sp.getKey()+ ", Value:  " +sp.getValue());
    }
}
