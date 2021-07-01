package lesson2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        integerArray();
        emptyArray();
        anotherArray();
        squareArray();
        checkMinMaxArray();
    }

    //    #1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    //    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void integerArray() {
        int[] integerArr = {0, 1, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < integerArr.length; i++) {
            if (integerArr[i] == 0) integerArr[i] = 1;
            else integerArr[i] = 0;
        }

        System.out.println(Arrays.toString(integerArr));
    }

    //    #2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    private static void emptyArray() {
        int[] emptyArr = new int[8];
        int j = 0;
        for (int i = 0; i < emptyArr.length; i++) {
            emptyArr[i] = j;
            j += 3;
        }

        System.out.println(Arrays.toString(emptyArr));
    }

    //    #3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    private static void anotherArray() {
        int[] anotherArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < anotherArr.length; i++) {
            if (anotherArr[i] < 6) anotherArr[i] *= 2;
        }

        System.out.println(Arrays.toString(anotherArr));
    }

    //    #4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    //    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    private static void squareArray() {
        int[][] squareArr = new int[3][3];
        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[i].length; j++) {
                if (i == j) squareArr[i][j] = 1;
                if (j == squareArr.length - 1 - i) squareArr[i][j] = 1;
            }
            System.out.println(Arrays.toString(squareArr[i]));
        }
    }

    //    #5 Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    private static void checkMinMaxArray() {
        int[] checkArr = {1, 356, -293, 568, 12, -756, 856};
        int min = 0;
        int max = 0;

        for (int i = 0; i < checkArr.length; i++) {
            if (checkArr[i] < min) {
                min = checkArr[i];
            }
            if (checkArr[i] > max) {
                max = checkArr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }

}
