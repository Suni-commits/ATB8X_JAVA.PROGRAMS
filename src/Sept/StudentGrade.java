package Sept;

public class StudentGrade {
    public static void main(String[] args)
    {
        int score = 85;
        char grade = score >= 95 ? 'A' : score<=85 ? 'B' : score <=75 ? 'C' :'D' ;
        System.out.println("The Student grade is " + grade);

    }

}
