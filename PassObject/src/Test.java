class Test {
    int i;
    int j;

    Test(int i, int j) {
        this.i = i;
        this.j = j;
    }


    boolean equalsTo(Test test) {
        return this.i == test.i && this.j == test.j;
    }
}
