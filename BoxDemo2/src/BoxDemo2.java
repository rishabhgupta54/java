class BoxDemo2 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.height = 10;
        box1.width = 20;
        box1.depth = 30;

        box2.height = 12;
        box2.width = 13;
        box2.depth = 14;

        box1.volume();
        box2.volume();
    }
}
