package Oct;

public class ATBStudent {
    String name ;
    int age ;
    boolean isATBstudent;
    String address;
    boolean isfemale;
public ATBStudent(){
    name = "suneetha";
    age = 45;
    isATBstudent=true;
    address = "hyderabad";
    isfemale=false;

}
    public static void main(String[] args) {
        ATBStudent stu = new ATBStudent();
        System.out.println("student name  :" + stu.name);
        System.out.println("Age of the student is  :" + stu.age);
        System.out.println("The student is  from ATB8X :" + stu.isATBstudent);
        System.out.println("Address of the student is : " +stu.address);
        System.out.println("Gender of the student is female ? : " +stu.isfemale);


    }
}
