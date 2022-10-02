package lesson04;

public class Task03 {
    public static void main(String[] args) {
        int numberPrevious = 0;
        int numberCurrent = 1;
        final int TOTAL_NUMBERS_TO_PRINT = 10;
        int i = 0;
        while (i < TOTAL_NUMBERS_TO_PRINT) {
            int numberNext = numberPrevious + numberCurrent;
            System.out.print(numberPrevious + (i < (TOTAL_NUMBERS_TO_PRINT - 1) ? ", " : ""));
            numberPrevious = numberCurrent;
            numberCurrent = numberNext;
            i++;
        }
    }
}
