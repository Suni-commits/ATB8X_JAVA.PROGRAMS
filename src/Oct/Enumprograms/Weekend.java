package Oct.Enumprograms;
public class Weekend {
    public enum WeekEnd {
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        WeekEnd we=WeekEnd.SATURDAY;
        WeekEnd we1=WeekEnd.SUNDAY;

        System.out.println("First day of the weekend is :" +we);
        System.out.println("Second day of the weekend is :" +we1);

    }
}