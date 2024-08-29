class AccessTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.a = 10;
        test.b = 20;
        // test.c = 30;

        test.setC(30);

        System.out.println("Values of a, b and c is " + test.a + ", " + test.b + ", " + test.getC());
    }
}
