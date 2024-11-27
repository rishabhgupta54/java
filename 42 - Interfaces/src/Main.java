public class Main {
    public static void main(String[] args) {
        ITelephone telephone = new DeskPhone(123456);
        telephone.powerOn();
        telephone.callPhone(123456);
        telephone.answer();

        telephone = new MobilePhone(12345);
        telephone.powerOn();
        telephone.callPhone(12345);
        telephone.answer();
    }
}
