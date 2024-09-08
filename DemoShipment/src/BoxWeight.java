class BoxWeight extends Box {
    private double weight;

    BoxWeight() {
        super();
        this.weight = 0;
    }

    BoxWeight(BoxWeight boxWeight) {
        super(boxWeight);
        this.weight = boxWeight.weight;
    }

    BoxWeight(double length, double weight) {
        super(length);
        this.weight = weight;
    }

    BoxWeight(double height, double width, double depth, double weight) {
        super(height, weight, depth);
        this.weight = weight;
    }

    double weight() {
        return this.weight;
    }
}
