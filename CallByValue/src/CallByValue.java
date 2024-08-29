class CallByValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        Test test = new Test();

        System.out.println("a and b before calling the function: " + a + " " + b);

        test.meth(a, b);

        System.out.println("a and b after calling the function: " + a + " " + b);

    }
}
