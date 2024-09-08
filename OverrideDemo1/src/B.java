class B extends A {
    int k;

    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        System.out.println("Value of K is " + this.k);
    }

}
