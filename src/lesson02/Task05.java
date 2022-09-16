package lesson02;

public class Task05 {
    public static void main(String[] args) {
        float numberWithFractionalPart = 56.001f;
        int numberWithoutFractionalPart = (int) numberWithFractionalPart;
        System.out.println("Число содержит вещественную часть: " + ((float) numberWithoutFractionalPart != numberWithFractionalPart));
    }
}
