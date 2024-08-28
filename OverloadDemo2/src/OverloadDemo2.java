class OverloadDemo2 {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(10, 20);
        overload.test(123); // automatically converted the parameter to type double as no matching function with parameter of type int is found.
    }
}
