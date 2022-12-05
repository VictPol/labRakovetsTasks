package lesson03;

public class Task03 {
    public static void main(String[] args) {
        final String INFO_ABOUT_PART_OF_DAY = "Now is ";

        int hourOfDay = 0;
        if (hourOfDay < 0 || hourOfDay > 24) {
            System.out.println("You entered wrong value hour of day");
        }
        else if (hourOfDay >= 0 && hourOfDay < 6 || hourOfDay == 24) {
            System.out.println(INFO_ABOUT_PART_OF_DAY + "night");
        } else if (hourOfDay < 12) {
            System.out.println(INFO_ABOUT_PART_OF_DAY + "morning");
        } else if (hourOfDay < 18) {
            System.out.println(INFO_ABOUT_PART_OF_DAY + "day");
        } else if (hourOfDay < 24) {
            System.out.println(INFO_ABOUT_PART_OF_DAY + "evening");
        }
    }
}
