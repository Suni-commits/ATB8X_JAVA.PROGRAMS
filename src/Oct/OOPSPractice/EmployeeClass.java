package Oct.OOPSPractice;

public class EmployeeClass {
    String name="";
    String job_title="";
    double salary;

    EmployeeClass(String name,String job_title,double salary){
        this.name=name;
        this.job_title=job_title;
        this.salary=salary;
    }
    String getName(){
        return name;

    }
    String getJob_title(){
        return job_title;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;


    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;

    }
    public void  updateSalary(){
        salary=salary+salary*40/100;
            System.out.println("After increasing salary: " +salary);
    }
    public static void main(String[] args){
        EmployeeClass ec=new EmployeeClass("Ramesh","Software Engineer",37000);

        System.out.println("Name of the employee : "+ec.getName());
        System.out.println("designation of the employee : "+ec.getJob_title());
        System.out.println("Intial salary of the employee : "+ec.getSalary());
        ec.updateSalary();

    }
}
