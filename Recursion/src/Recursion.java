class Recursion {
    public static void main(String[] args) {
        Test test = new Test(10);

        for (int i = 0; i < 10; i++) {
            test.values[i] = i;
        }

        test.printArray(10);
    }
}
