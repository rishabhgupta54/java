public class Main {
    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6);
        mclaren.addGear(1, 5.3);
        mclaren.addGear(2, 10.6);
        mclaren.addGear(3, 15.9);
        mclaren.operateClutch(true);
        mclaren.changeGear(1);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));
        mclaren.changeGear(2);
        System.out.println(mclaren.wheelSpeed(2000));
        mclaren.operateClutch(true);
        mclaren.changeGear(3);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(6000));
    }
}
