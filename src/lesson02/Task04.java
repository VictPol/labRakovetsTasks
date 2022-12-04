package lesson02;

public class Task04 {
    public static void main(String[] args) {
        final int NUMBER_OF_THREE_DIGITS = 517;
        final int SECOND_NUMBER_OF_DIGITS = 10;
        final int THIRD_NUMBER_OF_DIGITS = 100;

        System.out.println(NUMBER_OF_THREE_DIGITS / THIRD_NUMBER_OF_DIGITS + NUMBER_OF_THREE_DIGITS % THIRD_NUMBER_OF_DIGITS / SECOND_NUMBER_OF_DIGITS + NUMBER_OF_THREE_DIGITS % SECOND_NUMBER_OF_DIGITS);
    }
}
