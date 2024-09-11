class Rectangle extends Figure {
    public Rectangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    double area() {
        System.out.println("Area of rectangle is ");
        return this.dimension1 * this.dimension2;
    }
}
