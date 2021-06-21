package lesson1;

public class firstHomeWork {
    public static void main(String[]args) {
        first(12,10,24,18);
    }

    /* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – аргументы этого метода, имеющие тип float. */

        private static float first(float a, float b, float c, float d) {
            System.out.println("Результат выражения: " + a * (b + (c / d)));
            return a * (b + (c / d));
        }
}
