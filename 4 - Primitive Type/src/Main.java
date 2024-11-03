public class Main {
    public static void main(String[] args) {
        int myValue = 10_000;
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer MIN Value = " + intMinValue);
        System.out.println("Integer MAX Value = " + intMaxValue);
        System.out.println("Busted MIN value = " + (intMinValue - 1));
        System.out.println("Busted MAX value = " + (intMaxValue + 1));

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN Value = " + byteMinValue);
        System.out.println("Byte MAX Value = " + byteMaxValue);

        short shortMinValue = Short.MIN_VALUE;
        short shortMaxvalue = Short.MAX_VALUE;
        System.out.println("Short MIN Value = " + shortMinValue);
        System.out.println("Short MAX Value = " + shortMaxvalue);

        long longValue = 100L;
        long longMinValue = Long.MAX_VALUE;
        long longMaxValue = Long.MIN_VALUE;
        System.out.println("Long MIN Value = " + longMinValue);
        System.out.println("Long MAX Value = " + longMaxValue);
    }
}
