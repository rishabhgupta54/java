class CallByReference {
    public static void main(String[] args) {
        Test test = new Test(5, 10);

        System.out.println("i and j before calling the function: " + test.i + " " + test.j);

        test.meth(test);

        System.out.println("i and j after calling the function: " + test.i + " " + test.j);
    }
}
