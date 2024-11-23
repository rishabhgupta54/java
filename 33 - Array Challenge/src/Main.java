import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = setIntegers(5);
        printArray(myInteger);
        System.out.println("Average is " + getAverage(myInteger));
    }

    public static int[] setIntegers(int size) {
        System.out.println("Enter " + size + " numbers");
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value at index " + i + " is " + array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }
}
