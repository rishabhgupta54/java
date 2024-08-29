class Test {
    int i;

    public Test(int i) {
        this.i = i;
    }

    Test incrementByTen() {
        Test test = new Test(this.i + 10);
        return test;
    }
}
