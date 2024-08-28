class Box {
    double height;
    double width;
    double depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    double volume() {
        return height * width * depth;
    }
}
