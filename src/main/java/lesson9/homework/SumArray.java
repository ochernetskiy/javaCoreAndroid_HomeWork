package lesson9.homework;

public class SumArray {
    public static final int ARRAY_SIZE = 4;

    public static int sum(String[][] arr) {
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != ARRAY_SIZE) throw new MyArraySizeException("Needs 4x4 array");
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(String.format("Not a number data at cell [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Sum is " + sum);
        return sum;
    }
}
