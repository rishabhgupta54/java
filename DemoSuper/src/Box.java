class Box {
    private double height;
    private double width;
    private double depth;

    Box() {
        this.height = this.width = this.depth = 0;
    }

    Box(Box box) {
        this.height = box.height;
        this.width = box.width;
        this.depth = box.depth;
    }

    Box(double length) {
        this.height = this.width = this.depth = length;
    }

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double volume() {
        return this.height * this.width * this.depth;
    }
}
