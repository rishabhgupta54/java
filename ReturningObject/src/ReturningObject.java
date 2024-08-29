class ReturningObject {
    public static void main(String[] args) {
        Test test = new Test(50);

        Test test2 = test.incrementByTen();

        System.out.println(test2.i);
    }
}
