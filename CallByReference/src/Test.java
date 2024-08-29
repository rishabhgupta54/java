class Test {
    int i;
    int j;

    Test(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void meth(Test test) {
        test.i *= test.i;
        test.j /= test.j;
    }
}
