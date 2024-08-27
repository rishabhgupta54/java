class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.width = 20;
        box1.depth = 30;

        double volume1 = box1.height * box1.width * box1.depth;

        Box box2 = new Box();
        box2.height = 7.6;
        box2.width = 8.7;
        box2.depth = 9.8;

        double volume2 = box2.height * box2.width * box2.depth;

        System.out.println("Volume of the box1 is: " + volume1);
        System.out.println("Volume of the box2 is: " + volume2);
    }
}
