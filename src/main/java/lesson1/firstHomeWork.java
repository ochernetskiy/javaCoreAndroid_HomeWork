package lesson1;

public class firstHomeWork {
    public static void main(String[]args) {
        first(12,10,24,18);
        second(12,8);
        third(-3);
    }

    /* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – аргументы этого метода, имеющие тип float. */

        private static float first(float a, float b, float c, float d) {
            System.out.println("Результат выражения: " + a * (b + (c / d)));
            return a * (b + (c / d));
        }

    /* Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно),
        если да – вернуть true, в противном случае – false. */

        private static int second(int a, int b) {
            if (a + b >= 10 && a + b <= 20) {
                System.out.println(10==10);
            } else {
                System.out.println(10!=10);
            }
            return a + b;
        }

    /* Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом. */

        private static int third(int a) {
            if (a >= 0) {
                System.out.println("Введено положительное число");
            } else {
                System.out.println("Введено отрицательное число");
            }
            return a;
        }
}
