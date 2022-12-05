package lesson03;

public class Task01 {
    public static void main(String[] args) {
        final String INFO_ABOUT_DAY_OF_WEEK = "Today is ";

        int dayOfWeek = 7;
        switch (dayOfWeek) {
            case 1:
                System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Monday");
                break;
            case 2:
                System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Tuesday");
                break;
            case 3:
                System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Wednesday");
                break;
            case 4:
                System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Thursday");
                break;
            case 5:
                System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Friday");
                break;
            case 6:
                System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Saturday");
                break;
            case 7:
                System.out.println(INFO_ABOUT_DAY_OF_WEEK + "Sunday");
                break;
            default:
                System.out.println("You entered wrong value day of week!");
        }
    }
}
