class Test {
    int a; // if you don't mention the access specifier then java will set it to default. default access specifier like public and you can access it within the same package
    public int b; // public and can be access outside this class and outside the package
    private int c; // private and can be access within this class


    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
