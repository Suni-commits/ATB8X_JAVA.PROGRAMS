package Oct.OOPSPractice;

public class DefaultConstExam1 {
    private String emp_name="";
    private int emp_id;
    DefaultConstExam1()
    {
        emp_name="SUNEETHA";
        emp_id=38;
    }
    public static void main(String[] args){
        DefaultConstExam1 dce=new DefaultConstExam1();
        System.out.println("The name of the employee is " +dce.emp_name);
        System.out.println("The employee id is  "+ dce.emp_id);
        System.out.println("After change the name in lower case is  "+dce.emp_name.toLowerCase());
        System.out.println(dce.emp_name.toLowerCase().contains("t"));


    }
}
