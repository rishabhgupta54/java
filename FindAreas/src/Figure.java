public class Figure {
    double dimension1;
    double dimension2;

    public Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    double area() {
        System.out.println("Area of figure is undefined");
        return 0;
    }
}
