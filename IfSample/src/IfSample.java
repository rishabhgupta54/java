class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if(x < y) {
            System.out.println("X is less than y");
        }

        x = x * 2;
        if(x == y) {
            System.out.println("x now equals to y");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("X now greater than y");
        }

        if(x == y) {
            System.out.println("You won't see this");
        }
    }
}