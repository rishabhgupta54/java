public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[5] = 19.99;
        System.out.println(myDoubleArray[0]);
        System.out.println(myDoubleArray[5]);

        int[] myIntArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myIntArray1[5]);

        int[] myIntArray2 = new int[10];
        for (int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i * 10;
        }

        for (int i = 0; i < myIntArray2.length; i++) {
            System.out.println("Element: " + i + ", Value: " + myIntArray2[i]);
        }
    }
}
