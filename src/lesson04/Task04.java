package lesson04;

public class Task04 {
    public static void main(String[] args) {
        final int FIRST_VALUE = 1;
        final int LAST_VALUE = 10;
        int i = FIRST_VALUE;
        while (i <= LAST_VALUE) {
            int j = FIRST_VALUE;
            while (j <= LAST_VALUE) {
                System.out.print(i * j +"\t");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
