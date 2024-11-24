import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Alex");

        // ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i)); // Autoboxing - converting the int base primitive type to Integer class
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(integerArrayList.get(i).intValue()); // Unboxing - converting the Integer class to int base primitive type
        }

    }
}
