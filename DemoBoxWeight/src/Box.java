class Box {
    double height;
    double width;
    double depth;

    Box() {
        this.height = this.width = this.depth = 0;
    }

    Box(Box box) {
        this.height = box.height;
        this.width = box.width;
        this.depth = box.depth;
    }

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    Box(double length) {
        this.height = this.width = this.depth = length;
    }

    double volume() {
        return this.height * this.width * this.depth;
    }
}
