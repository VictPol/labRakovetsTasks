package lesson03;

public class Task02 {
    public static void main(String[] args) {
        final String INFO_ABOUT_DAY_OF_WEEK= "Today is ";

        int dayOfWeek = 7;
        if (dayOfWeek == 1) {
            System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Monday");
        } else if (dayOfWeek == 2) {
            System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Friday");
        } else if (dayOfWeek == 6) {
            System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Sunday");
        } else {
            System.out.println("You entered wrong value day of week!");
        }
    }
}
