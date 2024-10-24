package Oct.OOPSPractice;

public class LanguagePoly {
    public void displayInfo() {
        System.out.println("English is the common language");
    }
}
class Java extends LanguagePoly{
    public void displayInfo(){
        System.out.println("Java is Object Oriented Programming Language");
    }
}
class Python extends LanguagePoly{
    public void displayInfo(){
        System.out.println("Python is Object Oriented Programming Language also it is very easy to understand");
    }
}
class JavaScript extends LanguagePoly{
    public void displaInfo(){
        System.out.println("JavaScirpt is Frontend based language to develope UI");
    }
}
