package Oct.OOPSPractice;

public class PersonClass {
    String name="";
    int age;

    PersonClass(String name,int age)
    {
        this.name=name;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args){
        PersonClass pc=new PersonClass("SUNEETHA",35);
        System.out.println(pc.getName());
        System.out.println(pc.getAge());

    }
}
