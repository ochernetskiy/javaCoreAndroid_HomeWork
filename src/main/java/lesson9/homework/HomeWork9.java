package lesson9.homework;

public class HomeWork9 {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"12", "34", "4", "10"},
                {"12", "290", "17", "96"},
                {"917", "-10", "10", "69"},
                {"34", "4", "12", "235"}
        };

        try {
           SumArray.sum(arr);
        } catch (MyArrayDataException | MyArraySizeException exception) {
            exception.printStackTrace();
        }
    }
}
