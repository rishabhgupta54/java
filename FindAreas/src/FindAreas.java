class FindAreas {
    public static void main(String[] args) {
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(10, 10);
        Triangle triangle = new Triangle(10, 10);
        Figure reference;

        reference = figure;
        System.out.println(figure.area());

        reference = rectangle;
        System.out.println(reference.area());

        reference = triangle;
        System.out.println(reference.area());
    }
}
