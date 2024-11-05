package NovGenericExample;

public class GenericmethodExampe {
    public static <T> void printArray(T[] array){
        for( T element: array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer[] i={3,8,9,7,1};
        String[] s={"Apple","Banana","Grapes","C-Apple"};
        System.out.println("Integer Array: ");
        printArray(i);

        System.out.println("String Array: ");
        printArray(s);
    }
}
