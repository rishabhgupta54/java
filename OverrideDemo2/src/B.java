class B extends A {
    int k;

    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        super.show();
        System.out.println("k: " + this.k);
    }
}
