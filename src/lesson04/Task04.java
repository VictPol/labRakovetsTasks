package lesson04;

public class Task04 {
    public static void main(String[] args) {
        // task - print multiplication table from 1 to 10
        int numberOfColumn = 1;
        int i = 0;
        while (i < 10) {
            int numberOfRow = 1;
            int j = 0;
            while (j < 10) {
                System.out.println(numberOfColumn * numberOfRow);
                numberOfRow++;
                j++;
            }
            numberOfColumn++;
            i++;
        }
    }
}
