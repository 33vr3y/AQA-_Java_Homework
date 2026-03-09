package lesson_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Задание 1===");
        printThreeWords();
        System.out.println("===Задание 2===");
        checkSumSign();
        System.out.println("===Задание 3===");
        printColor();
        System.out.println("===Задание 4===");
        compareNumbers();
        System.out.println("===Задание 5===");
        boolean result = checkSum();
        System.out.println("Результат: " + result);
        System.out.println("===Задание 6===");
        checkNumber();
        System.out.println("===Задание 7===");
        boolean check = checkNumber2();
        System.out.println("Результат: " + check);
        System.out.println("===Задание 8===");
        repeatString();
        System.out.println("===Задание 9===");
        boolean year = isLeap();
        System.out.println(year);
        System.out.println("===Задание 10===");
        swapArray();
        System.out.println("===Задание 11===");
        array100();
        System.out.println("===Задание 12===");
        arrayX2();
        System.out.println("===Задание 13===");
        matrix();
        System.out.println("===Задание 14===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение длины: ");
        int len = scanner.nextInt();
        System.out.print("Введите значение массива: ");
        int initialValue = scanner.nextInt();
        int[] arr = test14(len, initialValue);
        System.out.print("Созданный массив: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printThreeWords() {            //Задание 1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {              //Задание 2
        int a = 4;
        int b = -15;
        int sum = a+b;
        if (sum>=0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {           //Задание 3
        int value = 52;
        if(value<=0){
            System.out.println("Красный");
        } else if (value>100) {
            System.out.println("Зелёный");
        }
        else {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers() {         //Задание 4
        int a = 91;
        int b = 37;
        if(a>=b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
    public static boolean checkSum() {                // Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int sum = a+b;
        return sum>=10 && sum<=20;
    }

    public static void checkNumber() {          //Задание 6
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        if (a>=0){
            System.out.println("Положительное");
        }
        else{
            System.out.println("Отрицательное");
        }
    }
    public static boolean checkNumber2(){           //Задание 7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        return a<0;
    }
    public static void repeatString() {           //Задание 8
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Сколько раз повторить: ");
        int a = scanner.nextInt();

        for (int i=0; i<a; i++){
            System.out.println(str);
        }
    }
    public static boolean isLeap(){             //Задание 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        return (year%400==0) || (year%4==0 && year%100 != 0);
    }
    public static void swapArray(){             //Задание 10
        int[] numbers = {1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0};
        System.out.print("Исходный массив: ");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i =0; i<numbers.length; i++){
            if(numbers[i]==0){
                numbers[i]=1;
            }
            else{
                numbers[i]=0;
            }
        }
        System.out.print("Изменённый массив: ");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void array100(){              //Задание 11
        int[] numbers = new int[100];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = i+1;
        }
        System.out.print("Массив: ");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void arrayX2(){               //Задание 12
        int[] arr =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Исходный массив: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 0; i<arr.length;  i++){
            if (arr[i]<6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.print("Изменённый массив: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void  matrix(){               //Задание 13
        int[][] matrix = new int[5][5];
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                if(i==j || i+j==matrix.length-1){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] =0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] test14(int len, int initialValue){
        int[] arr = new int[len];
        for(int i = 0; i<arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}