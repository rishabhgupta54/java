public class Main {
    public static void main(String[] args) {
        String numberAsString = "1234";
        System.out.println("NumberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("NumberAsString = " + numberAsString);
        System.out.println("number = " + number);

        System.out.println("------------------------------");

        numberAsString = "1234.456";
        System.out.println("NumberAsString = " + numberAsString);
        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("numberDouble = " + numberAsString);

        numberAsString += 1;
        numberDouble += 1;

        System.out.println("NumberAsString = " + numberAsString);
        System.out.println("numberDouble = " + numberDouble);

    }
}
