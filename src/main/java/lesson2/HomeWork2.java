package lesson2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        integerArray();
        emptyArray();
    }

    //        Задать целочисленный массив, состоящий из элементов 0 и 1.
    //        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void integerArray() {
        int[] integerArr = {0, 1, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < integerArr.length; i++) {
            if (integerArr[i] == 0) integerArr[i] = 1;
            else integerArr[i] = 0;
        }

        System.out.println(Arrays.toString(integerArr));
    }

    //    Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    private static void emptyArray() {
        int[] emptyArr = new int[8];
        int j = 0;
        for (int i = 0; i < emptyArr.length; i++) {
            emptyArr[i] = j;
            j += 3;
        }

        System.out.println(Arrays.toString(emptyArr));
    }

}
