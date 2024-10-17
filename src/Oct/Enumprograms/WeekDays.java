package Oct.Enumprograms;

public class WeekDays {
    public enum WeekDay {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {

        WeekDay wd= WeekDay.MONDAY;
        System.out.println(wd);
    }

}