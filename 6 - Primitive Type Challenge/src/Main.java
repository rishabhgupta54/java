public class Main {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortvalue = 20;
        int intValue = 50;
        long longTotal = 5000L + 10L * (byteValue + shortvalue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortvalue + intValue));
        System.out.println(shortTotal);
    }
}
