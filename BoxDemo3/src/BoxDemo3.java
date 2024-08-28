class BoxDemo3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.width = 15;
        box1.depth = 20;

        System.out.println("Volume is:" + box1.volume());
    }
}
