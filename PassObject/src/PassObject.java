class PassObject {
    public static void main(String[] args) {
        Test test1 = new Test(1, 2);
        Test test2 = new Test(1, 2);
        Test test3 = new Test(2, 3);

        System.out.println("test1 == test2: " + test1.equalsTo(test2));
        System.out.println("test1 == test3: " + test1.equalsTo(test3));
    }
}
