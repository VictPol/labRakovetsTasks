package lesson04;

public class Task03 {
    public static void main(String[] args) {
        // task - print first ten fibonacci numbers
        int numberPrevious = 0;
        int numberNext = 1;
        System.out.println(numberPrevious + "\n" + numberNext);
        int j = 2;
        while (j < 10) {
            numberPrevious += numberNext;
            numberNext += numberPrevious;
            System.out.println(numberPrevious + "\n" + numberNext);
            j += 2;
        }
    }
}
