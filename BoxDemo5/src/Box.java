class Box {
    double height;
    double width;
    double depth;

    Box() {
        System.out.println("Inside Constructor");
        height = 10;
        width = 10;
        depth = 10;
    }

    double volume() {
        return height * width * depth;
    }
}
