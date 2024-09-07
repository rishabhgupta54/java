public class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        this.i = b;
    }

    void show() {
        System.out.println("i in super class: " + super.i);
        System.out.println("i in sub class: " + this.i);
    }
}
