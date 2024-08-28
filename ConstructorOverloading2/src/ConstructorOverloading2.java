class ConstructorOverloading2 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(5, 10, 15);
        Box box4 = new Box(box2);

        System.out.println("box1: " + box1.volume());
        System.out.println("box2: " + box2.volume());
        System.out.println("box3: " + box3.volume());
        System.out.println("box4: " + box4.volume());
    }
}
