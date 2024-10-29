package Oct.JavaMostInterviewPrograms.PracticePrograms;
import java.util.*;
public class ArrayListObjects {
    String name;
    int age;
    ArrayListObjects(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
   public String toString()
    {
        return "Student{name='" + name + "', age=" + age +'}' ;
    }

    public static void main(String[] args){
        ArrayList<ArrayListObjects> students=new ArrayList<>();
        students.add(new ArrayListObjects("Sunitha", 19));
        students.add(new ArrayListObjects("Anitha", 20));
        students.add(new ArrayListObjects("Namitha", 19));

        for(Object O: students){
            System.out.println(O);
        }
    }

}
