class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment();
        Shipment shipment2 = new Shipment(5, 10, 20);
        Shipment shipment3 = new Shipment(5, 10, 15, 20, 50);
        Shipment shipment4 = new Shipment(shipment2);

        System.out.println("Volume of shipment 1 is: " + shipment1.volume());
        System.out.println("weight of shipment 1 is: " + shipment1.weight());

        System.out.println("Volume of shipment 2 is: " + shipment2.volume());
        System.out.println("weight of shipment 2 is: " + shipment2.weight());

        System.out.println("Volume of shipment 3 is: " + shipment3.volume());
        System.out.println("weight of shipment 3 is: " + shipment3.weight());

        System.out.println("Volume of shipment 4 is: " + shipment4.volume());
        System.out.println("weight of shipment 4 is: " + shipment4.weight());
    }
}
