class Overload {
    void test() {
        System.out.println("No Parameters");
    }

    void test(int a, int b) {
        System.out.println("With two parameter of type int a: " + a + " and int b" + b);
    }

    void test(double a) {
        System.out.println("With one parameter of type double a: " + a);
    }
}
