class SimpleInheritance {
    public static void main(String[] args) {
        A objA = new A();
        objA.i = 10;
        objA.j = 20;

        objA.showIJ();

        B objB = new B();
        objB.i = 15;
        objB.j = 20;

        objB.showIJ();
        objB.k = 25;
        objB.showK();

        objB.sum();
    }
}
