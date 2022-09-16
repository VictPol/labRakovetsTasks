package lesson03;

public class Task03 {
    public static void main(String[] args) {
        int currentHour = 24;
        if (currentHour < 0 || currentHour > 24) {
            System.out.println("Неверно указано значение часа");
        } else if (currentHour < 6 || currentHour == 24) {
            System.out.println("Доброй ночи");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро");
        } else  if (currentHour < 18) {
            System.out.println("Добрый день");
        } else {
            System.out.println("Добрый вечер");
        }
    }
}
