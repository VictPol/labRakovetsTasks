package lesson03;

public class Task04 {
    public static void main(String[] args) {
        final String INFO_ABOUT_PART_OF_DAY = "Now is ";

        int hourOfDay = 2;
        switch (hourOfDay) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 24:
                System.out.println(INFO_ABOUT_PART_OF_DAY + "night");
                break;
            case 6: case 7: case 8: case 9: case 10: case 11:
                System.out.println(INFO_ABOUT_PART_OF_DAY + "morning");
                break;
            case 12: case 13: case 14: case 15: case 16: case 17:
                System.out.println(INFO_ABOUT_PART_OF_DAY + "day");
                break;
            case 18: case 19: case 20: case 21: case 22: case 23:
                System.out.println(INFO_ABOUT_PART_OF_DAY + "evening");
                break;
            default:
                System.out.println("You entered wrong value hour of day");
        }
    }
}
