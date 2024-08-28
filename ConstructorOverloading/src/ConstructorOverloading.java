class ConstructorOverloading {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(5, 10, 15);

        System.out.println("Box 1: " + box1.volume());
        System.out.println("Box 2: " + box2.volume());
        System.out.println("Box 3: " + box3.volume());
    }
}
