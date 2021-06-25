package lesson2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        integerArray();
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

}
