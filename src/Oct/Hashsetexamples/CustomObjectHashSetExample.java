package Oct.Hashsetexamples;
import java.util.*;
 class SetExample1 {
    String name;
    int age;

    SetExample1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SetExample1)) return false;
        SetExample1 person = (SetExample1) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomObjectHashSetExample {
    public static void main(String[] args) {
        HashSet<SetExample1> people = new HashSet<>();
        people.add(new SetExample1("Alice", 30));
        people.add(new SetExample1("Bob", 25));
        people.add(new SetExample1("Alice", 30)); // Duplicate based on equals

        System.out.println("People: " + people);

    }
}
