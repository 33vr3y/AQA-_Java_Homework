package lesson_5;

public class Main {
    public static void main() {
        String[][] arr1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] arr2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "a"}
        };
        Array array = new Array(arr1);
        try {
            int result = array.sum();
            System.out.println("Сумма = " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arr1[5][5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выбран несуществующий индекс.");
        }
    }
}
