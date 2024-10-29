package Oct.JavaMostInterviewPrograms.PracticePrograms;
import java.util.*;

   class Product {
       String name;
       double price;

       Product(String name, double price) {
           this.name = name;
           this.price = price;
       }

       public String toString() {
           return name + " :  $" + price;
       }
   }
public class SortingCustomObject {
    public static void main(String[] args){
        ArrayList<Product> p=new ArrayList<>();
        p.add(new Product("Rice",56));
        p.add(new Product("Atta",54));
        p.add(new Product("Jowar",46));
        p.add(new Product("Rawa",32));
        p.add(new Product("wheat",49));

        Collections.sort(p,Comparator.comparingDouble(p1->p1.price));

        System.out.println("Sorted Products by Price: " + p);

        for(Object O:p){
            System.out.println(p);
        }
    }
}
