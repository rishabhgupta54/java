class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        this.weight = 0;
    }

    BoxWeight(BoxWeight boxWeight) {
        super(boxWeight);
        this.weight = boxWeight.weight;
    }

    BoxWeight(double length) {
        super(length);
        this.weight = 0;
    }

    BoxWeight(double height, double width, double depth, double weight) {
        super(height, width, depth);
        this.weight = weight;
    }
}
