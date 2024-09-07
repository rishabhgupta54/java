class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(5, 5, 5, 20);

        System.out.println("Volume of the box is: " + boxWeight.volume());
        System.out.println("Weight of the box is: " + boxWeight.weight);
    }
}
