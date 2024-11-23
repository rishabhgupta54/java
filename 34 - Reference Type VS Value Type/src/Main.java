import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = var1;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        var2++;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        int[] array1 = new int[5];
        int[] array2 = array1;

        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        array2[0] = 5;

        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        modifyArray(array2);

        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
    }

    public static void modifyArray(int[] array) {
        // array = new int[array.length]; // dereference the array.
        array[0] = 10;
    }
}
