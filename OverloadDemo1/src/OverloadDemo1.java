class OverloadDemo1 {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(2);
        overload.test(2, 3);
        System.out.println(overload.test(123.32));
    }
}
