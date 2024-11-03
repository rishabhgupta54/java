public class Main {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);
        myString = myString + " \uu00A9 2024";
        System.out.println("My string is equal to " + myString);

        String numberString = "10";
        numberString = numberString + "20";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 20;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
