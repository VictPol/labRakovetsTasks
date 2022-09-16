package lesson02;

public class Task04 {
    public static void main(String[] args) {
        int numberConsistOfThreeValue = 373;
        System.out.println("Сумма цифр числа равна: " + (numberConsistOfThreeValue / 100 + numberConsistOfThreeValue % 100 / 10 + numberConsistOfThreeValue % 10));
    }
}
