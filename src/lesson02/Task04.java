package lesson02;

public class Task04 {
    public static void main(String[] args) {
        final int THREE_NUMBERS = 537;
        final int TWO_STAGE = 100;
        final int ONE_STAGE = 10;
        System.out.println(THREE_NUMBERS / TWO_STAGE + THREE_NUMBERS % TWO_STAGE / ONE_STAGE + THREE_NUMBERS % ONE_STAGE);
    }
}
