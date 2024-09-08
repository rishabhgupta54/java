class Shipment extends BoxWeight {
    private double cost;

    Shipment() {
        super();
        this.cost = 0;
    }

    Shipment(Shipment shipment) {
        super(shipment);
        this.cost = shipment.cost;
    }

    Shipment(double length, double weight, double cost) {
        super(length, weight);
        this.cost = weight;
    }

    Shipment(double height, double width, double depth, double weight, double cost) {
        super(height, weight, depth, weight);
        this.cost = cost;
    }
}
