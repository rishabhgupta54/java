import javax.swing.*;

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight boxWeight1 = new BoxWeight();
        BoxWeight boxWeight2 = new BoxWeight(5);
        BoxWeight boxWeight3 = new BoxWeight(5, 10, 15, 20);
        BoxWeight boxWeight4 = new BoxWeight(boxWeight3);

        System.out.println("Volume of box 1 is: " + boxWeight1.volume());
        System.out.println("Weight of box 1 is: " + boxWeight1.weight);

        System.out.println("Volume of box 2 is: " + boxWeight2.volume());
        System.out.println("Weight of box 2 is: " + boxWeight2.weight);

        System.out.println("Volume of box 3 is: " + boxWeight3.volume());
        System.out.println("Weight of box 3 is: " + boxWeight3.weight);

        System.out.println("Volume of box 4 is: " + boxWeight4.volume());
        System.out.println("Weight of box 4 is: " + boxWeight4.weight);
    }
}
