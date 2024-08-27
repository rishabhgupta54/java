class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.width = 20;
        box1.depth = 30;

        double volume = box1.height * box1.width * box1.depth;

        System.out.println("Volume of the box is: " + volume);
    }
}
